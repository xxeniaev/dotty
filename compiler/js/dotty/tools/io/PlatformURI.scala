package dotty.tools.io

import java.net.URI


class PlatformURI {
  def parseServerAuthority: PlatformURI = ???
  def normalize: PlatformURI = ???
  def resolve(uri: PlatformURI): PlatformURI = ???
  def resolve(str: String): PlatformURI = ???
  def relativize(uri: PlatformURI): PlatformURI = ???
  def toURL: PlatformURL = ???
  def getScheme: String = ???
  def isAbsolute: Boolean = ???
  def isOpaque: Boolean = ???
  def getRawSchemeSpecificPart: String = ???
  def getSchemeSpecificPart: String = ???
  def getRawAuthority: String = ???
  def getAuthority: String = ???
  def getRawUserInfo: String = ???
  def getUserInfo: String = ???
  def getHost: String = ???
  def getPort: Int = ???
  def getPath: String = ???
  def getRawPath: String = ???
  def getQuery: String = ???
  def getRawQuery: String = ???
  def getFragment: String = ???
  def getRawFragment: String = ???
  def toASCIIString: String = ???
}

object PlatformURI {
  def create(str: String): PlatformURI = ???
  def apply(str: String) = ???
  def apply(scheme: String, userInfo: String, host: String, port: Int, path: String, query: String, fragment: String): PlatformURI = ???
  def apply(scheme: String, authority: String, path: String, query: String, fragment: String): PlatformURI = ???
  def apply(scheme: String, host: String, path: String, fragment: String): PlatformURI = ???
  def apply(scheme: String, ssp: String, fragment: String): PlatformURI = ???
  def apply(scheme: String, path: String): PlatformURI = ???
}
