package dotty.tools.io

trait PlatformFileFilter {
  def accept(pathname: PlatformFile): Boolean
}

