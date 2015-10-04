package tutorial

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class ScalableLanguageSuite extends FlatSpec with Matchers {

  "By default fields" should "be private" in {

    val instance = new FieldsArePrivate(23, "my name")

    assertCompiles("instance.toString")

    assertDoesNotCompile("instance.index")
    assertDoesNotCompile("instance.name")
  }

  "Java code" should "be available" in {

    val java = new VerboseImplementation

    java hasUpperCase "Abcde" shouldBe true
  }

  "Scala code" should "be concise" in {

    val nameHasUpperCase = "Abcde".exists(_.isUpper)
    nameHasUpperCase shouldBe true
  }

  "Iteration over numbers" should "be easy" in {

    var toThree = 0
    for (i <- 1 to 3)
      toThree += i
    toThree shouldBe 6

    var untilThree = 0
    for (i <- 1 until 3)
      untilThree += i
    untilThree shouldBe 3

    var toWithStep = 0
    for (i <- 1 to 9 by 2)
      toWithStep += i
    toWithStep shouldBe 25

    var untilWithStep = 0
    for (i <- 1 to 9 by 3)
      untilWithStep += i
    untilWithStep shouldBe 12
  }

  "Ranges" should "be fun" in {

    val range = 1 to 10 by 2

    range should contain allOf (1, 3, 5, 7, 9)
    range should contain noneOf (2, 4, 6, 8, 10)
  }

  "Access with parentheses" should "be easy to implement" in {

    object Some {
      def apply(name: String) =
        name.length
      def update(index: Int, value: Boolean) =
        index + (if (value) 1 else 0)
    }

    Some("name") shouldBe 4
    (Some(23) = true) shouldBe 24
  }
}