package dotty.tools.io

abstract class PlatformFileSystemProvider {
  def getScheme: String = ???
  def getPath(uri: PlatformURI): PlatformPath
}

object PlatformFileSystemProvider {
  def installedProviders: List[PlatformFileSystemProvider] = ???
}
