package tutorial

import org.scalatest.{ FlatSpec, Matchers }
import scala.collection.{ immutable, mutable }

class UsingSetsAndMaps extends FlatSpec with Matchers {

  "It" should "be easy to use sets" in {

    var jetSet = immutable.Set("Boeing", "Airbus")
    jetSet += "Lear"

    jetSet should not contain "Cessna"
  }

  it should "be easy to use mutable sets" in {

    val jetSet = mutable.Set("Boeing", "Airbus")
    jetSet += "Lear"

    jetSet should not contain "Cessna"
  }

  it should "be easy to use maps" in {

    val romanNumeral = immutable.Map(
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "IV",
      5 -> "V")

    romanNumeral should contain(2 -> "II")
    romanNumeral should have size 5
    romanNumeral should contain key 3
    romanNumeral should contain value "V"
  }

  it should "be easy to use mutable maps" in {

    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")

    treasureMap should have size 3
  }
}
