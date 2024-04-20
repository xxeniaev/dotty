package dotty.tools.io

import java.net.URI
import java.nio.file.{FileSystem, Path}

class PlatformFileSystems {

}

object PlatformFileSystems {
  def getFileSystem(uri: PlatformURI): PlatformFileSystem = ???
  def newFileSystem(path: PlatformPath, loader: ClassLoader): PlatformFileSystem = ???
  def newFileSystem(uri: PlatformURI, env: Map[String, Any]): PlatformFileSystem = ???
  def newFileSystem(uri: PlatformURI, env: Map[String, Any], loader: ClassLoader): PlatformFileSystem = ???
}


