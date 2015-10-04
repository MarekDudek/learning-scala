package classesobjects

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class ClassesFieldsMethods extends FlatSpec with Matchers {

  class SomeClass {
    var variable = 0
    val constant = 9
    private var variable2 = 0
  }

  "Fields" should "be public by default" in {

    val acc = new SomeClass

    acc.variable shouldBe 0

    acc.variable = 1
    acc.variable shouldBe 1

    assertDoesNotCompile("acc.variable2 = 23")
  }
}
