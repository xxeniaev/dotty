package dotty.tools.nio

trait PlatformFileAttribute[T] {
  def name: String
  def value: T
}



