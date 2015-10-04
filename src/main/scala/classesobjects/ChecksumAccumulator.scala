package classesobjects

import scala.collection.mutable.Map

class ChecksumAccumulator {

  private var sum = 0

  def add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int =
    ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {

  private val cache = Map[String, Int]()

  def calculate(string: String): Int =
    if (cache contains string) {
      cache(string)
    } else {
      val acc = new ChecksumAccumulator
      for { char <- string }
        acc add char.toByte
      val checksum = acc.checksum
      cache += (string -> checksum)
      checksum
    }
}
