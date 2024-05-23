package dotty.tools.io

import java.io.InputStream as PlatformInputStream

class PlatformFileInputStream extends PlatformInputStream {

}

object PlatformFileInputStream {
  def apply(file: PlatformFile): PlatformFileInputStream = ???
}