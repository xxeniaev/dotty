package dotty.tools.io


class PlatformFiles {
  def newDirectoryStream (dir: PlatformPath): PlatformDirectoryStream[PlatformPath] = ???
  def size(path: PlatformPath): Long = ???
  def getLastModifiedTime(path: PlatformPath, options: LinkOption*): PlatformFileTime = ???
}

object PlatformFiles {

}

