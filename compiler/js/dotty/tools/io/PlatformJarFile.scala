package dotty.tools.io

class PlatformJarFile {
  def getInputStream(ze: PlatformZipEntry): PlatformInputStream = ???
}

object PlatformJarFile {
  def apply(file: PlatformFile): PlatformJarFile = ???
}

