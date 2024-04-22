package dotty.tools.io

import scala.math.Ordering

class PlatformRandomAccessFile {
  def setLength(newLength: Long): Unit = ???
  def close(): Unit = ???
  }

object PlatformRandomAccessFile {
  def apply(name: String, mode: String): PlatformRandomAccessFile = ???
  def apply(file: PlatformFile, mode: String): PlatformRandomAccessFile = ???
}