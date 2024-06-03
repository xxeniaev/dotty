package dotty.tools.io

import java.util.Iterator

abstract class PlatformStream[T] extends PlatformBaseStream[T, PlatformStream[T]] {
  override def iterator: Iterator[T] = ???
  def toArray[A](generator: Int => Array[A]): Array[A] = ???
}

object PlatformStream {
}