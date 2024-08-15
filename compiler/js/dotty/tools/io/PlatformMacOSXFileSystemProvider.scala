package dotty.tools.io

class PlatformMacOSXFileSystemProvider extends PlatformFileSystemProvider{
  override def newFileSystem(dir: String): PlatformMacOSXFileSystem = PlatformMacOSXFileSystem(this, dir)
}



