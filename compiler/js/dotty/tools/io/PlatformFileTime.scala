package dotty.tools.io


class PlatformFileTime {
  def toMillis: Long = ???
}

object PlatformFileTime {
  def fromMillis(value: Long): PlatformFileTime = ???
}

