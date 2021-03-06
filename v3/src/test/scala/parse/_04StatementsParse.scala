package parse

import grammar.M2Parser
import m3.Ast0._
import org.antlr.v4.runtime.tree.ParseTree
import org.scalatest.FunSuite

import scala.collection.immutable.ArraySeq

/**
  * Created by over on 01.05.17.
  */
class _04StatementsParse extends FunSuite {
  val parserBlockBody = new ParseUtil {
    override def whatToParse: (M2Parser) => ParseTree = { parser => parser.blockBody() }
  }

  import parserBlockBody._

  test("store") {
    withStr("x: Int = 1", Store(ScalarTh(ArraySeq(), "Int", None, "prelude"), ArraySeq(lId("x")), lInt("1")))
    withStr("x = 1", Store(AnyTh, ArraySeq(lId("x")), lInt("1")))
    withStr("x.y.z = 1", Store(AnyTh, ArraySeq(lId("x"), lId("y"), lId("z")), lInt("1")))
    withStr("m(0, 0) = 1", SelfCall("set", lId("m"), ArraySeq(lInt("0"), lInt("0"), lInt("1"))))
  }

  test("while") {
    withStr("while true do 1 .", While(lBoolean("true"), ArraySeq(lInt("1"))))
    withStr("while true do 1 ; 1 .", While(lBoolean("true"), ArraySeq(lInt("1"), lInt("1"))))
  }
}