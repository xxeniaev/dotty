package dotty.tools.io

import java.net.URLStreamHandler
import java.io.Serializable

final class PlatformURL extends Serializable {
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
}

object PlatformURL {
  def apply(protocol: String, host: String, port: Int, file: String, handler: URLStreamHandler): PlatformURL = ???
  def apply(protocol: String, host: String, port: Int, file: String): PlatformURL = ???
  def apply(protocol: String, host: String, file: String): PlatformURL = ???
  def apply(context: PlatformURL, spec: String, handler: URLStreamHandler): PlatformURL = ???
  def apply(context: PlatformURL, spec: String): PlatformURL = ???
  def apply(spec: String): PlatformURL = ???
}

