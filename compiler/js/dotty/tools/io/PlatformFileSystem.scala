package dotty.tools.io

import java.lang.Iterable as JIterable

class PlatformFileSystem {
  def provider: PlatformFileSystemProvider = ???
  def getPath(first: String, more: String*): PlatformPath = ???
  def getRootDirectories: JIterable[PlatformPath] = ???
  def getFileStores: JIterable[PlatformFileStore] = ???
  def close(): Unit = ???
  def getSeparator: String = ???
}

object PlatformFileSystem {

}


