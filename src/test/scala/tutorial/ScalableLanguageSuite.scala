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
}