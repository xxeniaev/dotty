package dotty.tools.io

import java.nio.file.Path


class PlatformPath {
  def toPlainFile: AbstractFile = ???
  def resolve(uri: String): PlatformPath = ???
  def toAbsolutePath: PlatformPath = ???
}

object PlatformPath {

}

