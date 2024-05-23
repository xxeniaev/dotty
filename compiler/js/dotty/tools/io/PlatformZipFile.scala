package dotty.tools.io

import java.io.InputStream as PlatformInputStream

class PlatformZipFile {
  def close(): Unit = ???
  def getEntry(name: String): PlatformZipEntry = ???
  def getInputStream(entry: PlatformZipEntry): PlatformInputStream = ???
  def entries(): Iterator[_ <: PlatformZipEntry] = ???
}

object PlatformZipFile {
  def apply(name: String): PlatformZipFile = ???
  def apply(file: PlatformFile, mode: Int): PlatformZipFile = ???
  def apply(file: PlatformFile): PlatformZipFile = ???
}