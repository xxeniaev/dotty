package dotty.tools.io

class PlatformJarEntry extends PlatformZipEntry {
}

object PlatformJarEntry {
  def apply(name: String): PlatformJarEntry = ???
  def apply(ze: PlatformZipEntry): PlatformJarEntry = ???
}