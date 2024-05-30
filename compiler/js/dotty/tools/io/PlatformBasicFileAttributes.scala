package dotty.tools.io

trait PlatformBasicFileAttributes {
  def lastModifiedTime(): PlatformFileTime
  def fileKey(): Object
}