package dotty.tools.nio

import dotty.tools.io.PlatformPath
import java.io.IOException

trait PlatformFileVisitor[T] {
  def visitFile(file: T, attrs: PlatformFileAttribute[T]): PlatformFileVisitResult
  def postVisitDirectory(dir: PlatformPath, exc: IOException): PlatformFileVisitResult
}


