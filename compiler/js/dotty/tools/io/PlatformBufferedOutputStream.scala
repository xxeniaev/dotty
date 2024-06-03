package dotty.tools.io

import java.io.OutputStream

abstract class PlatformBufferedOutputStream extends OutputStream {
}

object PlatformBufferedOutputStream {
  def apply(in: OutputStream): PlatformBufferedOutputStream = ???
}