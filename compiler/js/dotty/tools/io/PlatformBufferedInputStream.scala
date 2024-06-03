package dotty.tools.io

import java.io.InputStream

class PlatformBufferedInputStream {
  def read(): Int = ???
  def read(b: Array[Byte], off: Int, len: Int): Int = ???
  def close(): Unit = ???
}

object PlatformBufferedInputStream {
  def apply(in: InputStream): PlatformBufferedInputStream = ???
}