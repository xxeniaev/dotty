package dotty.tools.dotc.interfaces

import java.util.Optional


/** A diagnostic is a message emitted during the compilation process.
 *
 *  It can either be an error, a warning or an information.
 *
 *  User code should not implement this interface, but it may have to
 *  manipulate objects of this type.
 */
object Diagnostic {
  val ERROR = 2
  val WARNING = 1
  val INFO = 0
}
trait Diagnostic {
  /** @return The message to report */
  def message: String
  /** @return Level of the diagnostic, can be either ERROR, WARNING or INFO */
  def level: Int
  /** @return The position in a source file of the code that caused this diagnostic
   *  to be emitted. */
  def position: Optional[SourcePosition]
}
