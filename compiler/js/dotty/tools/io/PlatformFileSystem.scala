package dotty.tools.io

class PlatformFileSystem {
  def getPath(first: String, more: String*): PlatformPath = ???
  def getRootDirectories: Iterable[PlatformPath] = ???
}

object PlatformFileSystem {

}


