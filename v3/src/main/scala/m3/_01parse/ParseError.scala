package m3._01parse

import m3.AstInfo

sealed trait ParseError extends Exception
object PE {
  case class ArgTypeHintRequired(location: AstInfo) extends ParseError
  case class DoubleTypeDeclaration(location: AstInfo) extends ParseError
  case class DoubleDefDeclaration(location: AstInfo) extends ParseError
  case class DoubleSelfDefDeclaration(location: AstInfo) extends ParseError
}
