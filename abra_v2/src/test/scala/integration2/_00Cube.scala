package integration2

import codegen2.CodeGenUtil
import m3.parse.FsResolver
import org.scalatest.FunSuite


// TODO - не создавать функцию-конструктор для каждой константы
class _00Cube extends FunSuite {
  test("a cube demo") {
    val resolver = new FsResolver(
      "/home/over/build/abra_lang/abra_v2/abra/lib/",
      "/home/over/build/abra_lang/abra_v2/abra/demo/")
    CodeGenUtil.runModules(resolver.resolve, 0, entry = ".cube", prelude = Some("prelude"),
      linkerFlags = Seq("-lGL", "-lSOIL", "-lSDL2", "-lkazmath"))
  }

}
