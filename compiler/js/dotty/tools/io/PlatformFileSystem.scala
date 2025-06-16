package dotty.tools.io

import java.lang.Iterable as JIterable

class PlatformFileSystem {
  def provider: PlatformFileSystemProvider = ???
  def getPath(first: String, more: String*): PlatformPath = {
    val path = if (more.isEmpty) {
      first
    } else {
      val sb = new StringBuilder()
      sb.append(first)

      for (segment <- more) {
        if (segment.nonEmpty) {
          if (sb.nonEmpty) sb.append(PlatformFile.separator) // или типа того
          sb.append(segment)
        }
      }
      sb.toString()
    }

    new PlatformPath(this, path)
  }
  def getRootDirectories: JIterable[PlatformPath] = ???
  def getFileStores: JIterable[PlatformFileStore] = ???
  def close(): Unit = ???
  def getSeparator: String = ???
}

object PlatformFileSystem {

}


