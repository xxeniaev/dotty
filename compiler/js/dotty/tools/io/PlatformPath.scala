package dotty.tools.io

class PlatformPath {
  def getFileSystem: PlatformFileSystem = ???
  def isAbsolute: Boolean = ???
  def getRoot: PlatformPath = ???
  def getFileName: PlatformPath = ???
  def getParent: PlatformPath = ???
  def getNameCount: Int = ???
  def getName(index: Int): PlatformPath = ???
  def subpath(beginIndex: Int, endIndex: Int): PlatformPath = ???
  def startsWith(other: PlatformPath): Boolean = ???
  def startsWith(other: String): Boolean = ???
  def endsWith(other: PlatformPath): Boolean = ???
  def endsWith(other: String): Boolean = ???
  def normalize: PlatformPath = ???
  def resolve(other: PlatformPath): PlatformPath = ???
  def resolve(other: String): PlatformPath = ???
  def resolveSibling(other: PlatformPath): PlatformPath = ???
  def resolveSibling(other: String): PlatformPath = ???
  def relativize(other: PlatformPath): PlatformPath = ???
  def toUri: PlatformURI = ???
  def toAbsolutePath: PlatformPath = ???
  def toRealPath(options: LinkOption*): PlatformPath = ???
  def toFile: PlatformFile = ???
}

object PlatformPath {
  def of(first: String, more: String*): PlatformPath = ???
  def of(uri: PlatformURI): PlatformPath = ???
}
