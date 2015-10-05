

object HelloWorldApp extends App {
  println("Hello, world!")
  for { arg <- args } {
    println(arg)
  }
}
