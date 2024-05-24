package dotty.tools.io

import java.io.IOException
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.jar.JarFile

object JDK9Reflectors {
    // private static final MethodHandle RUNTIME_VERSION_PARSE;
    // private static final MethodHandle RUNTIME_VERSION;
    // private static final MethodHandle RUNTIME_VERSION_MAJOR;
    // private static final MethodHandle NEW_JAR_FILE;

    // static {
    //     RUNTIME_VERSION_PARSE = lookupRuntimeVersionParse();
    //     RUNTIME_VERSION = lookupRuntimeVersion();
    //     RUNTIME_VERSION_MAJOR = lookupRuntimeVersionMajor();
    //     NEW_JAR_FILE = lookupNewJarFile();
    // }

    // Classes from java.lang.Runtime are not available in JDK 8 so using them explicitly would prevent this file from compiling with JDK 8
    // but these methods are not called in runtime when using this version of JDK

    def runtimeVersionParse(string: String): Any =
      ???

    def runtimeVersion(): Any =
      ???

    def runtimeVersionMajor(/*java.lang.Runtime.Version*/ version: Any): Int =
      ???

    def newJarFile(file: PlatformFile, verify: Boolean, mode: Int, version: Any): JarFile =
      ???
}
