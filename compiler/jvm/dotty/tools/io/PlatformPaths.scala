package dotty.tools.io


class PlatformPaths {
  def get(first: String, more: String*): PlatformPath = ???
  def get(uri: PlatformURI): PlatformPath = ???
}

object PlatformPaths {

}


