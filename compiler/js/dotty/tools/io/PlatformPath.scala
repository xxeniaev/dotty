package dotty.tools.io

import java.lang.Iterable

class PlatformPath extends Iterable[PlatformPath]{
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
  def toFile: PlatformFile = ???
  def iterator: java.util.Iterator[PlatformPath] = ???
}

object PlatformPath {
  def of(first: String, more: String*): PlatformPath = PlatformFileSystems.getDefault().getPath(first, more*)
  def of(uri: PlatformURI): PlatformPath = {
    val scheme = uri.getScheme
    if scheme == null then
      throw new IllegalArgumentException("Missing scheme")

    if scheme.equalsIgnoreCase("file") then
      return PlatformFileSystems.getDefault().provider.getPath(uri)

    PlatformFileSystemProvider.installedProviders
      .find(_.getScheme.equalsIgnoreCase(scheme))
      .map(_.getPath(uri))
      .getOrElse(PlatformPath())

//    throw new FileSystemNotFoundException(s"""Provider "$scheme" not installed""")
  }
}
