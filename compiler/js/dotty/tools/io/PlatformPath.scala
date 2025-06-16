package dotty.tools.io

import java.lang.Iterable
import scala.collection.AbstractIterator

class PlatformPath private (val fs: PlatformFileSystem, val path: Array[Byte]) extends Iterable[PlatformPath]{

  private def pathStr: String = new String(path, "UTF-8")


  def getFileSystem: PlatformFileSystem = fs
  def isAbsolute: Boolean = pathStr.startsWith("/")
  def getRoot: PlatformPath = if (isAbsolute) new PlatformPath(fs, "/".getBytes("UTF-8")) else null
  def getFileName: PlatformPath = {
    val parts = pathStr.split("/").filter(_.nonEmpty)
    if (parts.nonEmpty)
      new PlatformPath(fs, parts.last.getBytes("UTF-8"))
    else null
  }
  def getParent: PlatformPath = {
    val idx = pathStr.lastIndexOf("/")
    if (idx <= 0) null
    else new PlatformPath(fs, pathStr.substring(0, idx).getBytes("UTF-8"))
  }
  def getNameCount: Int = pathStr.split("/").count(_.nonEmpty)
  def getName(index: Int): PlatformPath = {
    val parts = pathStr.split("/").filter(_.nonEmpty)
    if (index < 0 || index >= parts.length)
      throw new IllegalArgumentException(s"Invalid index: $index")
    new PlatformPath(fs, parts(index).getBytes("UTF-8"))
  }
  def subpath(beginIndex: Int, endIndex: Int): PlatformPath = {
    val parts = pathStr.split("/").filter(_.nonEmpty)
    if (beginIndex < 0 || endIndex > parts.length || beginIndex >= endIndex)
      throw new IllegalArgumentException(s"Invalid range: $beginIndex to $endIndex")
    val sub = parts.slice(beginIndex, endIndex).mkString("/")
    new PlatformPath(fs, sub.getBytes("UTF-8"))
  }
  def startsWith(other: PlatformPath): Boolean =
    pathStr.startsWith(new String(other.path, "UTF-8"))
  def startsWith(other: String): Boolean =
    pathStr.startsWith(other)
  def endsWith(other: PlatformPath): Boolean =
    pathStr.endsWith(new String(other.path, "UTF-8"))
  def endsWith(other: String): Boolean =
    pathStr.endsWith(other)
  def normalize: PlatformPath = {
    val parts = pathStr.split("/").filterNot(p => p == "." || p.isEmpty)
    val stack = scala.collection.mutable.Stack[String]()
    parts.foreach {
      case ".." if stack.nonEmpty => stack.pop()
      case ".." => // ignore
      case p => stack.push(p)
    }
    new PlatformPath(fs, stack.reverse.mkString("/").getBytes("UTF-8"))
  }
  def resolve(other: PlatformPath): PlatformPath = {
    val otherStr = new String(other.path, "UTF-8")
    if (otherStr.startsWith("/")) other
    else new PlatformPath(fs, (pathStr + "/" + otherStr).getBytes("UTF-8"))
  }
  def resolve(other: String): PlatformPath =
    resolve(new PlatformPath(fs, other.getBytes("UTF-8")))
  def resolveSibling(other: PlatformPath): PlatformPath =
    if (getParent != null) getParent.resolve(other) else other
  def resolveSibling(other: String): PlatformPath =
    resolveSibling(new PlatformPath(fs, other.getBytes("UTF-8")))
  def relativize(other: PlatformPath): PlatformPath = {
    val baseParts = pathStr.split("/").filter(_.nonEmpty)
    val otherParts = new String(other.path, "UTF-8").split("/").filter(_.nonEmpty)
    val commonLength = baseParts.zip(otherParts).takeWhile { case (a, b) => a == b }.length
    val up = List.fill(baseParts.length - commonLength)("..")
    val down = otherParts.drop(commonLength)
    val result = (up ++ down).mkString("/")
    new PlatformPath(fs, result.getBytes("UTF-8"))
  }
  def toUri: PlatformURI = PlatformURI("file://" + pathStr)
  def toAbsolutePath: PlatformPath =
    if (isAbsolute) this else new PlatformPath(fs, ("/" + pathStr).getBytes("UTF-8"))
  def toFile: PlatformFile = PlatformFile(pathStr)
  def iterator: java.util.Iterator[PlatformPath] = ???

  def this(fs: PlatformFileSystem, input: String) = {
    this(fs, PlatformPath.encode(fs, PlatformPath.normalizeAndCheck(input)))
  }
}

object PlatformPath {
  def of(first: String, more: String*): PlatformPath = {
    val full = (first +: more).mkString("/")
    PlatformFileSystems.getDefault().getPath(full)
  }
  def of(uri: PlatformURI): PlatformPath = {
    // Преобразуем URI в путь (убираем "file://" если есть)
    val uriStr = uri.toString
    val pathStr =
      if (uriStr.startsWith("file://")) uriStr.stripPrefix("file://")
      else uriStr
    PlatformFileSystems.getDefault().getPath(pathStr)
  }
  // Метод для кодирования строки в байты
  def encode(fs: PlatformFileSystem, input: String): Array[Byte] = {
    // Логика кодирования (можно использовать методы стандартной библиотеки)
    input.getBytes("UTF-8")
  }

  // Метод для нормализации и проверки строки
  def normalizeAndCheck(input: String): String = {
    // Логика нормализации и проверки строки, например, удаление лишних слешей
    input.replaceAll("/{2,}", "/")
  }
}
