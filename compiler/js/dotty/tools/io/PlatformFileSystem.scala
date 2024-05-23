package dotty.tools.io

import java.lang.Iterable as JIterable
import dotty.tools.nio.{PlatformFileStore, PlatformFileSystemProvider}

class PlatformFileSystem {
  def provider: PlatformFileSystemProvider = ???
  def getPath(first: String, more: String*): PlatformPath = ???
  def getRootDirectories: JIterable[PlatformPath] = ???
  def getFileStores: JIterable[PlatformFileStore] = ???
  def close(): Unit = ???
}

object PlatformFileSystem {

}


