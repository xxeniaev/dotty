package dotty.tools.io

import java.util.Enumeration
import java.util.function.Function
import java.util.jar.JarEntry

class PlatformZipFile {
  def close(): Unit = ???
}

object PlatformZipFile {
  def apply(file: PlatformFile): PlatformZipFile = ???

  private def entries(func: Function[String, JarEntry]): Enumeration[JarEntry] = ???
}