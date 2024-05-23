package dotty.tools.io

trait PlatformBasicFileAttributes {
  def lastModifiedTime(): PlatformFileTime
//  def lastAccessTime(): FileTime
//  def creationTime(): FileTime
//  def isRegularFile(): Boolean
//  def isDirectory(): Boolean
//  def isSymbolicLink(): Boolean
//  def isOther(): Boolean
//  def size(): Long
  def fileKey(): AnyRef
}