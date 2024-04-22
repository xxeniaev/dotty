package dotty.tools.file

import java.lang.{Iterable as JIterable}

class PlatformFileSystem {
  def provider: FileSystemProvider = ???
  def getFileStores: Iterable[FileStore] = ???

}

object PlatformFileSystem {
}


