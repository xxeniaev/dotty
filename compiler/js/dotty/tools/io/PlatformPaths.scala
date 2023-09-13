package dotty.tools.io

class PlatformPaths {

}

object PlatformPaths {
  def get(first: String, more: String*): PlatformPath = ???
  def get(uri: PlatformURI): PlatformPath = ???
}

