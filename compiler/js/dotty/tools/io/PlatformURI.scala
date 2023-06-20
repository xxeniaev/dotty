package dotty.tools.io


class PlatformURI {
  def relativize(uri: PlatformURI): PlatformURI = ???
  def resolve(uri: PlatformURI): PlatformURI = ???
  def toURL: PlatformURL = ???
}

object PlatformURI {
  def apply(str: String): PlatformURI = ???
  def apply(scheme: String, ssp: String, fragment: String): PlatformURI = ???
}

