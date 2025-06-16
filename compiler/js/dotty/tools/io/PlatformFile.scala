package dotty.tools.io

import org.scalajs.dom
import sun.security.action.GetPropertyAction

class PlatformFile(val file: dom.File) {
  def getName: String = file.name
  def getParent: String = null
  def getParentFile: PlatformFile = null
  def getPath: String = file.name
  def isAbsolute: Boolean = false
  def getAbsolutePath: String = file.name
  def getAbsoluteFile: PlatformFile = this
  def getCanonicalPath: String = file.name
  def getCanonicalFile: PlatformFile = this
  def toURL: PlatformURL = throw new UnsupportedOperationException("No filesystem URI in browser")
  def toURI: PlatformURI = throw new UnsupportedOperationException("No filesystem URI in browser")
  def canRead: Boolean = true
  def canWrite: Boolean = false
  def exists: Boolean = true
  def isDirectory: Boolean = false
  def isFile: Boolean = true
  def isHidden: Boolean = false
  def lastModified: Long = file.lastModified.toLong
  def length: Long = file.size.toLong
  def createNewFile: Boolean = false
  def delete: Boolean = false
  def deleteOnExit(): Unit = ()
  def list: Array[String] = Array.empty
  def listFiles(): Array[PlatformFile] = Array.empty
  def listFiles(f: PlatformFile => Boolean): Array[PlatformFile] = Array.empty
  def mkdir: Boolean = false
  def mkdirs: Boolean = false
  def renameTo(dest: PlatformFile): Boolean = false
  def setLastModified(time: Long): Boolean = false
  def setReadOnly: Boolean = false
  def setWritable(writable: Boolean, ownerOnly: Boolean): Boolean = false
  def setWritable(writable: Boolean): Boolean = false
  def setReadable(readable: Boolean, ownerOnly: Boolean): Boolean = false
  def setReadable(readable: Boolean): Boolean = false
  def setExecutable(executable: Boolean, ownerOnly: Boolean): Boolean = false
  def setExecutable(executable: Boolean): Boolean = false
  def canExecute: Boolean = false
  def getTotalSpace: Long = -1L
  def getFreeSpace: Long = -1L
  def getUsableSpace: Long = -1L
  def toPath: PlatformPath = throw new UnsupportedOperationException("No paths in browser")
}

object PlatformFile {
  def apply(pathname: String, prefixLength: Int): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from pathname in Scala.js")
  def apply(child: String, parent: PlatformFile): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from parent in Scala.js")
  def apply(pathname: String): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from pathname in Scala.js")
  def apply(parent: String, child: String): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from parent in Scala.js")
  def apply(parent: PlatformFile, child: String): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from parent in Scala.js")
  def apply(uri: PlatformURI): PlatformFile =
    throw new UnsupportedOperationException("Cannot create PlatformFile from URI in Scala.js")
  def listRoots: Array[PlatformFile] = Array.empty
  def createTempFile(prefix: String, suffix: String, directory: PlatformFile): PlatformFile =
    throw new UnsupportedOperationException("Temporary files not supported in Scala.js")
  def createTempFile(prefix: String, suffix: String): PlatformFile =
    throw new UnsupportedOperationException("Temporary files not supported in Scala.js")
  val separator: String = "/"
  val separatorChar: Char = '/'
  val pathSeparator: String = ":"
}


