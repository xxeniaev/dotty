package dotty.tools.io

import java.io.InputStream as PlatformInputStream

class PlatformJarFile extends PlatformZipFile {
  def getInputStream(ze: PlatformZipEntry): PlatformInputStream = ???
}

object PlatformJarFile {
  def apply(file: PlatformFile): PlatformJarFile = ???
}

