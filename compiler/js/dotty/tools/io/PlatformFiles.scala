package dotty.tools.io

import java.nio.file.{LinkOption}
import java.util.List
import java.util.stream.{Stream => JStream}


class PlatformFiles {
  def newInputStream(path: PlatformPath, options: OpenOption*): InputStream = ???

  def newOutputStream(path: PlatformPath, options: OpenOption*): OutputStream = ???

  def newByteChannel(path: PlatformPath, options: Set[_ <: OpenOption], attrs: FileAttribute[_]*): SeekableByteChannel = ???

  def newByteChannel(path: PlatformPath, options: OpenOption*): SeekableByteChannel = ???

  def createFile(path: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???

  def createDirectory(dir: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???

  def createDirectories(dir: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???

  def createTempFile(dir: PlatformPath, prefix: String, suffix: String, attrs: FileAttribute[_]*): PlatformPath = ???

  def createTempFile(prefix: String, suffix: String, attrs: FileAttribute[_]*): PlatformPath = ???

  def createTempDirectory(dir: PlatformPath, prefix: String, attrs: FileAttribute[_]*): PlatformPath = ???

  def createTempDirectory(prefix: String, attrs: FileAttribute[_]*): PlatformPath = ???

  def createSymbolicLink(link: PlatformPath, target: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???

  def createLink(link: PlatformPath, existing: PlatformPath): PlatformPath = ???

  def delete(path: PlatformPath): Unit = ???


  def copy(source: PlatformPath, target: PlatformPath, options: CopyOption*): PlatformPath = ???

  def move(source: PlatformPath, target: PlatformPath, options: CopyOption*): PlatformPath = ???

  def getFileStore(path: PlatformPath): FileStore = ???

  def isSameFile(path: PlatformPath, path2: PlatformPath): Boolean = ???

  def isHidden(path: PlatformPath): Boolean = ???

  def probeContentType(path: PlatformPath): String = ???

  def getFileAttributeView[V <: FileAttributeView](path: PlatformPath, `type`: Class[V], options: LinkOption*): V = ???

  def readAttributes[A <: BasicFileAttributes](path: PlatformPath, `type`: Class[A], options: LinkOption*): A = ???

  def setAttribute(path: PlatformPath, attribute: String, value: PlatformObject, options: LinkOption*): PlatformPath = ???

  def getAttribute(path: PlatformPath, attribute: String, options: LinkOption*): PlatformObject = ???

  def readAttributes(path: PlatformPath, attributes: String, options: LinkOption*): Map[String, AnyRef] = ???

  def getPosixFilePermissions(path: PlatformPath, options: LinkOption*): Set[PosixFilePermission] = ???

  def setPosixFilePermissions(path: PlatformPath, perms: Set[PosixFilePermission]): PlatformPath = ???

  def getOwner(path: PlatformPath, options: LinkOption*): UserPrincipal = ???

  def setOwner(path: PlatformPath, owner: UserPrincipal): PlatformPath = ???


  def isDirectory(path: PlatformPath, options: LinkOption*): Boolean = ???

  def isRegularFile(path: PlatformPath, options: LinkOption*): Boolean = ???

  def getLastModifiedTime(path: PlatformPath, options: LinkOption*): PlatformFileTime = ???

  def setLastModifiedTime(path: PlatformPath, time: PlatformFileTime): PlatformPath = ???

  def size(path: PlatformPath): Long = ???


  def notExists(path: PlatformPath, options: LinkOption*): Boolean = ???

  def isReadable(path: PlatformPath): Boolean = ???

  def isWritable(path: PlatformPath): Boolean = ???

  def isExecutable(path: PlatformPath): Boolean = ???

  def walkFileTree(start: PlatformPath, options: Set[FileVisitOption], maxDepth: Int, visitor: FileVisitor[_ >: PlatformPath]): PlatformPath = ???

  def walkFileTree(start: PlatformPath, visitor: FileVisitor[_ >: PlatformPath]): PlatformPath = ???

  def newBufferedReader(path: PlatformPath, cs: Charset): BufferedReader = ???

  def newBufferedReader(path: PlatformPath): BufferedReader = ???

  def newBufferedWriter(path: PlatformPath, cs: Charset, options: OpenOption*): BufferedWriter = ???

  def newBufferedWriter(path: PlatformPath, options: OpenOption*): BufferedWriter = ???

  def copy(in: InputStream, target: PlatformPath, options: CopyOption*): Long = ???

  def copy(source: PlatformPath, out: OutputStream): Long = ???

  def readAllBytes(path: PlatformPath): Array[Byte] = ???

  def readString(path: PlatformPath): String = ???

  def readString(path: PlatformPath, cs: Charset): String = ???

  def readAllLines(path: PlatformPath, cs: Charset): List[String] = ???

  def readAllLines(path: PlatformPath): List[String] = ???

  def write(path: PlatformPath, bytes: Array[Byte], options: OpenOption*): PlatformPath = ???

  def write(path: PlatformPath, lines: Iterable[_ <: CharSequence], cs: Charset, options: OpenOption*): PlatformPath = ???

  def write(path: PlatformPath, lines: Iterable[_ <: CharSequence], options: OpenOption*): PlatformPath = ???

  def writeString(path: PlatformPath, csq: CharSequence, options: OpenOption*): PlatformPath = ???

  def writeString(path: PlatformPath, csq: CharSequence, cs: Charset, options: OpenOption*): PlatformPath = ???

  def find(start: PlatformPath, maxDepth: Int, matcher: BiPredicate[PlatformPath, BasicFileAttributes], options: FileVisitOption*): Stream[PlatformPath] = ???

  def lines(path: PlatformPath, cs: Charset): Stream[String] = ???

  def lines(path: PlatformPath): Stream[String] = ???
}


object PlatformFiles {
  def deleteIfExists(path: PlatformPath): Boolean = ???
  def getLastModifiedTime(path: PlatformPath, options: LinkOption*): PlatformFileTime = ???
  def size(path: PlatformPath): Long = ???
  def isDirectory (path: PlatformPath, options: LinkOption*): Boolean = ???
  def createDirectory (dir: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???
  def createDirectories (dir: PlatformPath, attrs: FileAttribute[_]*): PlatformPath = ???
  def list(dir: PlatformPath): JStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath): DirectoryStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath, glob: String): DirectoryStream[PlatformPath] = ???
  def newDirectoryStream(dir: PlatformPath, filter: DirectoryStream.Filter[_ >: PlatformPath]): DirectoryStream[PlatformPath] = ???
  def walk(start: PlatformPath, maxDepth: Int, options: FileVisitOption*): JStream[PlatformPath] = ???
  def walk(start: PlatformPath, options: FileVisitOption*): JStream[PlatformPath] = ???
  def exists(path: PlatformPath, options: LinkOption*): Boolean = ???
  def readSymbolicLink(link: PlatformPath): PlatformPath = ???
  def isSymbolicLink(path: PlatformPath): Boolean = ???
}

