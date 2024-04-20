package dotty.tools.io

class PlatformProperties {
  def load(inStream: PlatformInputStream): Unit = ???
  def getProperty(key: String): String = ???
}

object PlatformProperties {
  def apply(): PlatformProperties = ???
}