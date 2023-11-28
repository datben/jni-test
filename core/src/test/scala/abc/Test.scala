package abc

import org.scalatest.flatspec._

class SimpleSpec extends AnyFlatSpec {

  "Calling native methods in tests" should "work" in {
    new Adder(12)
    assert(true)
  }

}