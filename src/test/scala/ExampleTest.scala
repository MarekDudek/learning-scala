
import org.scalatest._

class ExampleTest extends FlatSpec with Matchers {

  "This test" should "be run by SBT" in {
    2 + 2 shouldBe 4
  }
}
