package dotty.tools.io

import java.io.IOException
import dotty.tools.nio.PlatformFileVisitor

class PlatformSimpleFileVisitor[T] extends PlatformFileVisitor[T] {
//
//  protected def this() = this()
//
//  override def preVisitDirectory(dir: T, attrs: BasicFileAttributes): FileVisitResult = ???
//
  override def visitFile(file: T, attrs: PlatformBasicFileAttributes): PlatformFileVisitResult = ???
//
//  override def visitFileFailed(file: T, exc: IOException): FileVisitResult = ???
//
  override def postVisitDirectory(dir: T, exc: IOException): PlatformFileVisitResult = ???
}