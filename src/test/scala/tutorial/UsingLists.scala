package tutorial

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import language.postfixOps

class UsingLists extends FlatSpec with Matchers {

  "Lists" should "be possible to concat" in {

    val one = List.range(1, 10, 2)
    val two = List.range(2, 9, 2)

    (one ::: two) should contain allOf (1, 2, 3, 4, 5, 6, 7, 8, 9)
  }

  it should "support many operations" in {

    val list1to3 = 1 to 3 toList
    val list4to5 = 4 to 5 toList
    val list1to5 = 1 to 5 toList

    List() shouldBe Nil
    list1to3 ::: list4to5 shouldBe list1to5

    list1to3.head shouldBe 1
    list1to3.tail shouldBe List(2, 3)
    list1to3.init shouldBe List(1, 2)
    list1to3.last shouldBe 3

    list1to3.isEmpty shouldBe false
    list1to3.length shouldBe 3

    list1to5 drop 3 shouldBe list4to5
    list1to5 dropRight 2 shouldBe list1to3

    list1to5.exists(_ % 2 == 0) shouldBe true
    list1to5.forall(_ % 2 == 0) shouldBe false
    list1to5.count(_ % 2 == 0) shouldBe 2
    list1to5.filter(_ % 2 == 0) shouldBe List(2, 4)

    list1to5.foreach(_ => ())
    list1to3.map(x => x * 2) shouldBe List(2, 4, 6)
    list1to3.mkString(":") shouldBe "1:2:3"
    list1to5.filterNot(_ % 2 == 0) shouldBe List(1, 3, 5)
    list1to3.reverse shouldBe List(3, 2, 1)

    (list4to5 ::: list1to3).sorted shouldBe list1to5
  }
}