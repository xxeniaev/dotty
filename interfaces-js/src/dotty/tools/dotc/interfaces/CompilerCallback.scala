package dotty.tools.dotc.interfaces

/** Set of callbacks called in response to events during the compilation process.
 *
 *  You should implement this interface if you want to react to one or more of
 *  these events.
 *
 *  See the method `process` of `dotty.tools.dotc.Driver` for more information.
 */trait CompilerCallback { /** Called when a class has been generated.
 *
 *  @param source         The source file corresponding to this class.
 *                        Example: ./src/library/scala/collection/Seq.scala
 *  @param generatedClass The generated classfile for this class.
 *                        Example: ./scala/collection/Seq$.class
 *  @param className      The name of this class.
 *                        Example: scala.collection.Seq$
 */def onClassGenerated(source: Nothing, generatedClass: Nothing, className: Nothing): Unit =  {
}
  /** Called when every class for this file has been generated.
   *
   *  @param source         The source file.
   *                        Example: ./src/library/scala/collection/Seq.scala
   */def onSourceCompiled(source: Nothing): Unit =  {
  }
}
