package classesobjects

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class ClassesFieldsMethods extends FlatSpec with Matchers {

  class ChecksumAccumulator

  "Class" should "have fields" in {

    val acc = new ChecksumAccumulator
  }
}
