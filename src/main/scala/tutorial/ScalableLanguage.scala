package tutorial

object ScalableLanguage extends App {

  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")

  println(capital("France"))

  import scala.collection.immutable.HashMap

  val numbers = HashMap("one" -> 1, "two" -> 2, "three" -> 3)

  println(numbers.getOrElse("four", 0))
}
