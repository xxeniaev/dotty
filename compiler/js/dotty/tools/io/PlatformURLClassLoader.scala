package dotty.tools.io



class PlatformURLClassLoader extends SecureClassLoader{
}

object PlatformURLClassLoader {
  def apply(urls: Array[PlatformURL], parent: ClassLoader): PlatformURLClassLoader = ???
}


