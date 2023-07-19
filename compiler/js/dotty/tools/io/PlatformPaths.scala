package dotty.tools.io

import java.nio.file.Path


class PlatformPaths {
  def get(first: String, more: String*): PlatformPath = ???
  def get(uri: PlatformURI): PlatformPath = ???
}

object PlatformPaths {

}


