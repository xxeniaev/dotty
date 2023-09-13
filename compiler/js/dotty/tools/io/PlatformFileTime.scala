package dotty.tools.io


class PlatformFileTime {
  def to(unit: TimeUnit): Long = ???
  def toMillis: Long = ???
  def toInstant: Instant = ???
}

object PlatformFileTime {
  def from(value: Long, unit: TimeUnit): PlatformFileTime = ???
  def fromMillis(value: Long): PlatformFileTime = ???
  def from(instant: Instant): PlatformFileTime = ???

}

