package dotty.tools.io

import scala.language.unsafeNulls

import java.nio.file.{FileSystemAlreadyExistsException, FileSystems}

import scala.jdk.CollectionConverters._
import dotty.tools.io.{PlatformFileSystems, PlatformURI, PlatformFiles}

/** This class implements an [[AbstractFile]] backed by a jar
  * that be can used as the compiler's output directory.
  */
class JarArchive private (root: Directory) extends PlainDirectory(root) {
  def close(): Unit = jpath.getFileSystem.close()
  def allFileNames(): Iterator[String] =
    PlatformFiles.walk(jpath).iterator().asScala.map(_.toString)
}

object JarArchive {

  /** Create a new jar file. Overwrite if file already exists */
  def create(path: Path): JarArchive = {
    require(path.extension == "jar")
    path.delete()
    open(path, create = true)
  }

  /** Create a jar file. */
  def open(path: Path, create: Boolean = false): JarArchive = {
    require(path.extension == "jar")

    // creating a new zip file system by using the JAR URL syntax:
    // https://docs.oracle.com/javase/7/docs/technotes/guides/io/fsp/zipfilesystemprovider.html
    val m: Map[String, Any] = Map("create" -> create.toString)
    val env = m.asJava
    val uri = PlatformURI.create("jar:" + path.toAbsolute.toURI.toString)
    val fs = {
      try PlatformFileSystems.newFileSystem(uri, env)
      catch {
        case _: FileSystemAlreadyExistsException =>
          PlatformFileSystems.getFileSystem(uri)
      }
    }
    val root = fs.getRootDirectories.iterator.next()
    new JarArchive(Directory(root))
  }
}
