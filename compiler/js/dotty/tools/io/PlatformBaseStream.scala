package dotty.tools.io

import java.util.Iterator

trait PlatformBaseStream[T, S <: PlatformBaseStream[T, S]] extends AutoCloseable {
  def iterator: Iterator[T]
}
