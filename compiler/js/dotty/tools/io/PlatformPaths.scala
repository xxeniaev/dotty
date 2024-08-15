package dotty.tools.io

class PlatformPaths {

}

object PlatformPaths {
  def get(first: String, more: String*): PlatformPath = PlatformPath.of(first, more*)
  def get(uri: PlatformURI): PlatformPath = PlatformPath.of(uri)
}

