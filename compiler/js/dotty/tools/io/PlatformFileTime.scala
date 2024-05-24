package dotty.tools.io


class PlatformFileTime extends Comparable[PlatformFileTime] {
  def toMillis: Long = ???

  override def compareTo(other: PlatformFileTime): Int = ???
}

object PlatformFileTime {
  def fromMillis(value: Long): PlatformFileTime = ???
}

