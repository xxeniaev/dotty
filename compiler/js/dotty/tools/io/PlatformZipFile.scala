package dotty.tools.io

import java.util.Enumeration
import java.util.function.Function
import java.util.jar.JarEntry

class PlatformZipFile {
  def close(): Unit = ???
}

object PlatformZipFile {
  def apply(name: String): PlatformZipFile = ???
  def apply(file: PlatformFile, mode: Int): PlatformZipFile = ???
  def apply(file: PlatformFile): PlatformZipFile = ???
  def apply(file: PlatformFile, mode: Int, charset: Charset): PlatformZipFile = ???
  def apply(name: String, charset: Charset): PlatformZipFile = ???
  def apply(file: PlatformFile, charset: Charset): PlatformZipFile = ???

  private def entries(func: Function[String, JarEntry]): Enumeration[JarEntry] = ???
}