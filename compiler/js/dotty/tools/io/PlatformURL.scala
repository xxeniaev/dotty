package dotty.tools.io

import java.net.URLStreamHandler


class PlatformURL {
  def fromURI(uri: PlatformURI): PlatformURL  = ???
  def getQuery: String = ???
  def getPath: String = ???
  def getUserInfo: String = ???
  def getAuthority: String = ???
  def getPort: Int = ???
  def getDefaultPort: Int = ???
  def getProtocol: String = ???
  def getHost: String = ???
  def getFile: String = ???
  def getRef: String = ???
  def sameFile(other: PlatformURL): Boolean = ???
  def toExternalForm: String = ???
  def toURI: PlatformURI = ???
//  def openConnection: URLConnection = ???
//  def openConnection(proxy: Proxy): URLConnection = ???
}

object PlatformURL {
  def apply(protocol: String, host: String, port: Int, file: String, handler: URLStreamHandler): PlatformURL = ???
  def apply(protocol: String, host: String, port: Int, file: String): PlatformURL = ???
  def apply(protocol: String, host: String, file: String): PlatformURL = ???
  def apply(context: PlatformURL, spec: String, handler: URLStreamHandler): PlatformURL = ???
  def apply(context: PlatformURL, spec: String): PlatformURL = ???
  def apply(spec: String): PlatformURL = ???

//  def openStream: InputStream = ???
//  def setURLStreamHandlerFactory(fac: URLStreamHandlerFactory): Unit = ???
}

