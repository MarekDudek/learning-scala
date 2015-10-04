package tutorial

import org.scalatest.FlatSpec

class DefiningFunctionsSuite extends FlatSpec {

  "Function defined with parentheses" should
    "be possible to call with and without parentheses" in {

      def greet(): Unit = ()

      greet()
      greet
    }

  "Function defined without parentheses" should
    "only be possible to call without parentheses" in {

      def greet: Unit = {}

      greet
      assertCompiles("greet")
      assertDoesNotCompile("greet()")
    }

  "Function" should "be easy to define" in {

    val f1 = (str: String) => println(str)
    def f2: Unit = (x: Int, y: Int) => x + y
    val f3: Function[Int, Int] = x => x + 1
  }

  "Calling function" should "not require parentheses" in {

    Nil.foreach(println)
    Nil.foreach { println }
    Nil foreach println
  }
}
