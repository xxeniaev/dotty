package dotty.tools.io

class PlatformMacOSXFileSystem extends PlatformFileSystem {
}

object PlatformMacOSXFileSystem {
  def apply(provider: PlatformFileSystemProvider, dir: String): PlatformMacOSXFileSystem = super(provider, dir)
}

