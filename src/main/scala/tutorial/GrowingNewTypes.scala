
package tutorial

object GrowingNewTypes {

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1
    else x * factorial(x - 1)

  import java.math.BigInteger
  import BigInteger.{ ZERO, ONE }

  def altFactorial(x: BigInteger): BigInteger =
    if (x == ZERO) ONE
    else x.multiply(altFactorial(x.subtract(ONE)))
}
