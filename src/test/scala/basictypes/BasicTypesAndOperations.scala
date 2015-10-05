package basictypes

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.language.postfixOps

class BasicTypesAndOperations extends FlatSpec with Matchers {

  "Raw strings" should "simplify a lot of things" in {

    val raw = """\n\t\"""

    raw shouldBe "\\n\\t\\"
  }

  "Multiline strings" should "be very helpful" in {

    val raw = """|This is a multiline string
                 |This is the second line
                 |And this is the third"""

    val newLines = raw.count(_ == '\n')

    newLines shouldBe 2
  }

  "Symbol literals" should "have some use but I don't know them" in {

    val symbol: Symbol = 'someSymbol
    val symbol2 = Symbol("someSymbol")

    assert(symbol === symbol2)

    symbol.name shouldBe "someSymbol"
  }

  "Operators" should "be method invocations" in {

    "Hello, world!" indexOf 'o' shouldBe 4

    "Hello, world!" indexOf ('o', 5) shouldBe 8
  }

  "Prefix operators" should "not be used with real name" in {

    2.unary_- shouldBe -2
  }

  case class SomeClass(val value: Double) {

    // scalastyle:off
    
    def unary_- = SomeClass(-value)
    def unary_+ = SomeClass(value * 2)
    def unary_! = SomeClass(1.0 / value)
    def unary_~ = !(-this)

    def * = SomeClass(value * value)
    
    // scalastyle:on
  }

  "Defining operators" should "be possible" in {

    val sc = SomeClass(2)

    -sc shouldBe SomeClass(-2)
    +sc shouldBe SomeClass(4)
    !sc shouldBe SomeClass(0.5)
    ~sc shouldBe SomeClass(-0.5)

    (sc*) shouldBe SomeClass(4)
  }

  "Object equality" should "work much better than in Java" in {

    val list = List(1, 2, 3)

    1 == 1 shouldBe true
    1 == 1.0 shouldBe true
    list == list shouldBe true

    list == "hello" shouldBe false

    // scalastyle:off
    list == null shouldBe false
    null == list shouldBe false

    assertCompiles("null == null shouldBe true")
    
    // scalastyle:on

    "he" + "llo" == "hello" shouldBe true
  }
}
