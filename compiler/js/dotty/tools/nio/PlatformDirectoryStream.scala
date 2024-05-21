package dotty.tools.nio

import java.lang.Iterable as JIterable

trait PlatformDirectoryStream[T] extends AutoCloseable, JIterable[T]
