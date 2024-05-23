package dotty.tools.io

trait PlatformOpenOption
object PlatformOpenOption {
  val CREATE = new PlatformOpenOption {}
  val APPEND = new PlatformOpenOption {}
  val TRUNCATE_EXISTING = new PlatformOpenOption {}
}
