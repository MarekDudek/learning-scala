package tutorial

import scala.io.Source
import math.max

import language.postfixOps

object CountChars extends App {

  def widthOfLength(line: String) =
    line.length.toString.length

  if (args isEmpty) {
    Console.err println "Please enter filename"
    sys exit 1
  }

  val source = Source fromFile args(0)
  val lines = source.getLines.toList

  val maxWidth = lines map(widthOfLength) reduceLeft(max)

  for (line <- lines) {
    val padding = " " * (maxWidth - widthOfLength(line))
    println(padding + line.length + " | " + line)
  }
}