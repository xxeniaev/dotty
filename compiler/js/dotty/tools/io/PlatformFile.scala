package dotty.tools.io

import sun.security.action.GetPropertyAction

class PlatformFile {
  def getName: String = ???
  def getParent: String = ???
  def getParentFile: PlatformFile = ???
  def getPath: String = ???
  def isAbsolute: Boolean = ???
  def getAbsolutePath: String = ???
  def getAbsoluteFile: PlatformFile = ???
  def getCanonicalPath: String = ???
  def getCanonicalFile: PlatformFile = ???
  def toURL: PlatformURL = ???
  def toURI: PlatformURI = ???
  def canRead: Boolean = ???
  def canWrite: Boolean = ???
  def exists: Boolean = ???
  def isDirectory: Boolean = ???
  def isFile: Boolean = ???
  def isHidden: Boolean = ???
  def lastModified: Long = ???
  def length: Long = ???
  def createNewFile: Boolean = ???
  def delete: Boolean = ???
  def deleteOnExit(): Unit = ???
  def list: Array[String] = ???
  def list(filter: FilenameFilter): Array[String] = ???
  def listFiles: Array[PlatformFile] = ???
  def listFiles(filter: FilenameFilter): Array[PlatformFile] = ???
  def listFiles(filter: FileFilter): Array[PlatformFile] = ???
  def mkdir: Boolean = ???
  def mkdirs: Boolean = ???
  def renameTo(dest: PlatformFile): Boolean = ???
  def setLastModified(time: Long): Boolean = ???
  def setReadOnly: Boolean = ???
  def setWritable(writable: Boolean, ownerOnly: Boolean): Boolean = ???
  def setWritable(writable: Boolean): Boolean = ???
  def setReadable(readable: Boolean, ownerOnly: Boolean): Boolean = ???
  def setReadable(readable: Boolean): Boolean = ???
  def setExecutable(executable: Boolean, ownerOnly: Boolean): Boolean = ???
  def setExecutable(executable: Boolean): Boolean = ???
  def canExecute: Boolean = ???
  def getTotalSpace: Long = ???
  def getFreeSpace: Long = ???
  def getUsableSpace: Long = ???
  def toPath: PlatformPath = ???
}

object PlatformFile {
  def apply(pathname: String, prefixLength: Int): PlatformFile = ???
  def apply(child: String, parent: PlatformFile): PlatformFile = ???
  def apply(pathname: String): PlatformFile = ???
  def apply(parent: String, child: String): PlatformFile = ???
  def apply(parent: PlatformFile, child: String): PlatformFile = ???
  def apply(uri: PlatformURI): PlatformFile = ???

  def listRoots: Array[PlatformFile] = ???
  def createTempFile(prefix: String, suffix: String, directory: PlatformFile): PlatformFile = ???
  def createTempFile(prefix: String, suffix: String): PlatformFile = ???
}


