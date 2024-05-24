package dotty.tools.io

class PlatformZipEntry {
  def entries(): Iterator[_ <: PlatformZipEntry] = ???
  def getSize: Long = ???
  def getTime: Long = ???
  def getName: String = ???

  def isDirectory: Boolean = ???

}

object PlatformZipEntry {
  def apply(name: String): PlatformZipEntry = ???
  def apply(e: PlatformZipEntry): PlatformZipEntry = ???
}

