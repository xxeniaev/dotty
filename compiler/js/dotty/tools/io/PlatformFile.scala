package dotty.tools.io


class PlatformFile {
  def exists: Boolean = ???
  def isDirectory: Boolean = ???
  def listFiles(): Array[PlatformFile] = ???
  def listFiles(filter: PlatformFile => Boolean): Array[PlatformFile] = ???
  def getName(): String = ???
}

object PlatformFile {

  def apply(v: String): PlatformFile = ???

  def apply(dir: PlatformFile, name: String): PlatformFile = ???
}

