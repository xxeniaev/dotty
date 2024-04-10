package dotty.tools.io

import java.net.URI
import java.nio.file.{FileSystem, Path}

class PlatformFileSystems {

}

object PlatformFileSystems {
  def getFileSystem(uri: PlatformURI): PlatformFileSystem = ???
  def newFileSystem(path: PlatformPath, loader: ClassLoader) = ???
}


