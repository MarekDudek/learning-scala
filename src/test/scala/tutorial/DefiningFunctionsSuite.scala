package tutorial

import org.scalatest.FlatSpec

class DefiningFunctionsSuite extends FlatSpec {

  "Function defined with parentheses" should
    "be possible to call with and without parentheses" in {

      def greet() = ()

      greet()
      greet
    }

  "Function defined without parentheses" should
    "only be possible to call without parentheses" in {

      def greet {}

      greet
      assertCompiles("greet")
      assertDoesNotCompile("greet()")
    }
}