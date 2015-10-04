package tutorial

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class UsingTuples extends FlatSpec with Matchers {

  "Tuples" should "be easy to define" in {

    val pair = (99, "Luftballons")

    pair._1 shouldBe 99
    pair._2 shouldBe "Luftballons"
  }
}
