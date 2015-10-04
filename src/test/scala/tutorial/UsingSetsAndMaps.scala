package tutorial

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class UsingSetsAndMaps extends FlatSpec with Matchers {

  "Using sets" should "be easy" in {

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"

    jetSet should not contain "Cessna"
  }

  "Using mutable sets" should "be easy" in {

    import scala.collection.mutable.Set

    val jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"

    jetSet should not contain "Cessna"
  }

  "Using maps" should "be easy" in {

    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")

    romanNumeral should contain(2 -> "II")
    romanNumeral should have size 5
    romanNumeral should contain key 3
    romanNumeral should contain value "V"
  }

  "Using mutable maps" should "be easy" in {

    import scala.collection.mutable.Map

    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")

    treasureMap should have size 3
  }
}