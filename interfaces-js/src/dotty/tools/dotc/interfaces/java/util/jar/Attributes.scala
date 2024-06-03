package dotty.tools.dotc.interfaces.java.util.jar

class Attributes {}

object Attributes {
  class Name(val name: String) {}

  object Name {
    val MANIFEST_VERSION = new Name("Manifest-Version")
    val SIGNATURE_VERSION = new Name("Signature-Version")
    val CONTENT_TYPE = new Name("Content-Type")
    val CLASS_PATH = new Name("Class-Path")
    val MAIN_CLASS = new Name("Main-Class")
    val SEALED = new Name("Sealed")
    val EXTENSION_LIST = new Name("Extension-List")
    val EXTENSION_NAME = new Name("Extension-Name")
    val IMPLEMENTATION_TITLE = new Name("Implementation-Title")
    val IMPLEMENTATION_VERSION = new Name("Implementation-Version")
    val IMPLEMENTATION_VENDOR = new Name("Implementation-Vendor")
    val SPECIFICATION_TITLE = new Name("Specification-Title")
    val SPECIFICATION_VERSION = new Name("Specification-Version")
    val SPECIFICATION_VENDOR = new Name("Specification-Vendor")
    val MULTI_RELEASE = new Name("Multi-Release")
  }
}
