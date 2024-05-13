package dotty.tools.io

import java.nio.file.{LinkOption}
import java.util.List
import java.util.stream.{Stream => JStream}
import dotty.tools.nio.PlatformFileAttribute


class PlatformFiles {
}


object PlatformFiles {
  def deleteIfExists(path: PlatformPath): Boolean = ???
  def getLastModifiedTime(path: PlatformPath, options: LinkOption*): PlatformFileTime = ???
  def size(path: PlatformPath): Long = ???
  def isDirectory (path: PlatformPath, options: LinkOption*): Boolean = ???
  def createDirectory[A](dir: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def createDirectories[A](dir: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def list(dir: PlatformPath): JStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath): DirectoryStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath, glob: String): DirectoryStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath, filter: DirectoryStream.Filter[_ >: PlatformPath]): DirectoryStream[PlatformPath] = ???
  def walk(start: PlatformPath, maxDepth: Int, options: FileVisitOption*): JStream[PlatformPath] = ???
  def walk(start: PlatformPath, options: FileVisitOption*): JStream[PlatformPath] = ???
  def exists(path: PlatformPath, options: LinkOption*): Boolean = ???
  def readSymbolicLink(link: PlatformPath): PlatformPath = ???
  def isSymbolicLink(path: PlatformPath): Boolean = ???
  def createFile[A](path: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def newOutputStream(path: PlatformPath, options: OpenOption*): OutputStream = ???
  def newInputStream(path: PlatformPath, options: OpenOption*): InputStream = ???

  def walkFileTree(start: PlatformPath, visitor: FileVisitor[_ >: Path]): PlatformPath = ???
  def isRegularFile(path: PlatformPath, options: LinkOption*): Boolean = ???
  def isReadable(path: PlatformPath): Boolean = ???
  def isWritable(path: PlatformPath): Boolean = ???
  def createTempDirectory[A](prefix: String, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def notExists(path: PlatformPath, options: LinkOption*): Boolean = ???
  def readAttributes(path: PlatformPath, attributes: String, options: LinkOption*): Map[String, AnyRef] = ???
}

