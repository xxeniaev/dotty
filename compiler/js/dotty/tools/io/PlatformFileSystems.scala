package dotty.tools.io

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

class PlatformFileSystems {
}

object PlatformFileSystems {
  def getDefault(): PlatformFileSystem = {
    val USER_DIR: String = "user.dir"
    val userDir: String = js.Dynamic.global.process.env.USER_DIR.asInstanceOf[String]
    val INSTANCE: MacOSXFileSystemProvider =
  }
  def getFileSystem(uri: PlatformURI): PlatformFileSystem = ???
  def newFileSystem(path: PlatformPath, loader: ClassLoader): PlatformFileSystem = ???
  def newFileSystem(uri: PlatformURI, env: JMap[String, ?]): PlatformFileSystem = ???
  def newFileSystem(uri: PlatformURI, env: JMap[String, ?], loader: ClassLoader): PlatformFileSystem = ???
}


