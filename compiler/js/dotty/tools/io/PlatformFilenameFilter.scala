package dotty.tools.io

trait PlatformFilenameFilter {
  def accept(dir: PlatformFile, name: String): Boolean
}

