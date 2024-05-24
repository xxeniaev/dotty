package dotty.tools.io

import java.io.InputStream as PlatformInputStream
import java.util.Enumeration


class PlatformZipFile {
  def close(): Unit = ???
  def getEntry(name: String): PlatformZipEntry = ???
  def getInputStream(entry: PlatformZipEntry): PlatformInputStream = ???
  def entries(): Enumeration[_ <: PlatformZipEntry] = ???
}

object PlatformZipFile {
  def apply(name: String): PlatformZipFile = ???
  def apply(file: PlatformFile, mode: Int): PlatformZipFile = ???
  def apply(file: PlatformFile): PlatformZipFile = ???
}