package tutorial

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.io.Source

import language.postfixOps

class ReadingFiles extends FlatSpec with Matchers {

  "Reading file" should "be easy" in {

    val source = Source fromFile "src/test/resources/example-file.txt"
    val lines = source getLines

    lines should have length 3
  }

  "Reading file" should "be even easier" in {

    val stream = getClass.getClassLoader.getResourceAsStream("example-file.txt")
    val source = Source.fromInputStream(stream)
    val lines = source getLines

    lines should have length 3
  }
}
