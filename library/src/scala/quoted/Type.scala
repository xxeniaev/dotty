package scala

package quoted {
  import scala.internal.quoted.TaggedType
  import scala.quoted.show.SyntaxHighlight

  sealed trait Type[T <: AnyKind] {
    type `$splice` = T

    /** Show a source code like representation of this type without syntax highlight */
    def show(implicit qctx: QuoteContext): String = qctx.show(this, SyntaxHighlight.plain)

    /** Show a source code like representation of this type */
    def show(syntaxHighlight: SyntaxHighlight)(implicit qctx: QuoteContext): String = qctx.show(this, syntaxHighlight)

  }

  /** Some basic type tags, currently incomplete */
  object Type {
    given UnitTag as Type[Unit] = new TaggedType[Unit]
    given BooleanTag as Type[Boolean] = new TaggedType[Boolean]
    given ByteTag as Type[Byte] = new TaggedType[Byte]
    given CharTag as Type[Char] = new TaggedType[Char]
    given ShortTag as Type[Short] = new TaggedType[Short]
    given IntTag as Type[Int] = new TaggedType[Int]
    given LongTag as Type[Long] = new TaggedType[Long]
    given FloatTag as Type[Float] = new TaggedType[Float]
    given DoubleTag as Type[Double] = new TaggedType[Double]
  }

}

package internal {
  package quoted {
    import scala.quoted.Type
    import scala.reflect.ClassTag
    import scala.runtime.quoted.Unpickler.Pickled

    /** A Type backed by a pickled TASTY tree */
    final class TastyType[T](val tasty: Pickled, val args: Seq[Any]) extends Type[T] {
      override def toString(): String = s"Type(<pickled tasty>)"
    }

    /** An Type backed by a value */
    final class TaggedType[T](implicit val ct: ClassTag[T]) extends Type[T] {
      override def toString: String = s"Type($ct)"
    }

    /** An Type backed by a tree */
    final class TreeType[Tree](val typeTree: Tree) extends Type[Any] {
      override def toString: String = s"Type(<tasty tree>)"
    }

  }
}
