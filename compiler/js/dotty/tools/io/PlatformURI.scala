package dotty.tools.io

import java.net.URI
import java.io.Serializable


final class PlatformURI extends Comparable[PlatformURI] with Serializable {
  def normalize: PlatformURI = ???
  def resolve(uri: PlatformURI): PlatformURI = ???
  def resolve(str: String): PlatformURI = ???
  def relativize(uri: PlatformURI): PlatformURI = ???
  def toURL: PlatformURL = ???
  def getScheme: String = ???
  def isAbsolute: Boolean = ???
  def isOpaque: Boolean = ???
  def getRawAuthority: String = ???
  def getHost: String = ???
  def getPort: Int = ???
  def getPath: String = ???
  def getFragment: String = ???
  def getRawPath: String = ???
  def getRawQuery: String = ???
  def getRawFragment: String = ???

  override def compareTo(that: PlatformURI): Int = ???
}

object PlatformURI {
  def create(str: String): PlatformURI = ???
  def apply(str: String) = ???
//  def apply(scheme: String, userInfo: String, host: String, port: Int, path: String, query: String, fragment: String): PlatformURI = ???
//  def apply(scheme: String, authority: String, path: String, query: String, fragment: String): PlatformURI = ???
//  def apply(scheme: String, host: String, path: String, fragment: String): PlatformURI = ???
//  def apply(scheme: String, ssp: String, fragment: String): PlatformURI = ???
  def apply(scheme: String, ssp: String, fragment: String): PlatformURI = ???
//  def apply(scheme: String, path: String): PlatformURI = ???
}
