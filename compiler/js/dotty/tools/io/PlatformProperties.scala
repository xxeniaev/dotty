package dotty.tools.io

import java.io.InputStream as PlatformInputStream

class PlatformProperties {
  def load(inStream: PlatformInputStream): Unit = ???
  def getProperty(key: String): String = ???
}

object PlatformProperties {
  def apply(): PlatformProperties = ???
}