package dotty.tools.io

import java.util.List
import java.util.stream.Stream as JStream
import java.util.Map as JMap
import dotty.tools.nio.{PlatformFileAttribute, PlatformFileVisitor}

import java.io.{BufferedWriter, InputStream as PlatformInputStream, OutputStream as PlatformOutputStream}
import java.nio.file.{OpenOption, Path}


class PlatformFiles {
}


object PlatformFiles {
  def newBufferedWriter(path: PlatformPath, options: PlatformOpenOption*): PlatformBufferedWriter = ???
  def deleteIfExists(path: PlatformPath): Boolean = ???
  def getLastModifiedTime(path: PlatformPath, options: PlatformLinkOption*): PlatformFileTime = ???
  def size(path: PlatformPath): Long = ???
  def isDirectory (path: PlatformPath, options: PlatformLinkOption*): Boolean = ???
  def createDirectory[A](dir: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def createDirectories[A](dir: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def list(dir: PlatformPath): JStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath): PlatformDirectoryStream[PlatformPath] = ???
  def walk(start: PlatformPath, options: PlatformFileVisitOption*): JStream[PlatformPath] = ???
  def exists(path: PlatformPath, options: PlatformLinkOption*): Boolean = ???
  def readSymbolicLink(link: PlatformPath): PlatformPath = ???
  def isSymbolicLink(path: PlatformPath): Boolean = ???
  def createFile[A](path: PlatformPath, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def newOutputStream(path: PlatformPath, options: PlatformOpenOption*): PlatformOutputStream = ???
  def newInputStream(path: PlatformPath, options: PlatformOpenOption*): PlatformInputStream = ???
  def walkFileTree(start: PlatformPath, visitor: PlatformFileVisitor[_ >: Path]): PlatformPath = ???
  def isRegularFile(path: PlatformPath, options: PlatformLinkOption*): Boolean = ???
  def isReadable(path: PlatformPath): Boolean = ???
  def isWritable(path: PlatformPath): Boolean = ???
  def createTempDirectory[A](prefix: String, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def createTempDirectory[A](dir: PlatformPath, prefix: String, attrs: PlatformFileAttribute[A]*): PlatformPath = ???
  def notExists(path: PlatformPath, options: PlatformLinkOption*): Boolean = ???
  def readAttributes(path: PlatformPath, attributes: String, options: PlatformLinkOption*): JMap[String, AnyRef] = ???
  def readAttributes[A <: PlatformBasicFileAttributes](path: Path, `type`: Class[A], options: PlatformLinkOption*): A = ???
}

