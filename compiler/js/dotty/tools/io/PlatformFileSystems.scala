package dotty.tools.io

import java.net.URI
import java.nio.file.{FileSystem, Path}
import java.util.{Map => JMap}

class PlatformFileSystems {
}

object PlatformFileSystems {
  def getDefault(): PlatformFileSystem = ???
  def getFileSystem(uri: PlatformURI): PlatformFileSystem = ???
  def newFileSystem(uri: PlatformURI, env: JMap[String, Any]): PlatformFileSystem = ???
}


