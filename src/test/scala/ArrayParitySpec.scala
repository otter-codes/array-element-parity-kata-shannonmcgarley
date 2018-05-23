import org.scalatest._

class ArrayParitySpec extends WordSpec with MustMatchers {

  "parity" must {

    "Remove a positive and negative Int of the same value in a list and return an Int " in {
      ArrayParity.parity(List(1,-1,2)) mustEqual 2
    }
    "Remove a positive and negative Int of the same value and remove duplicates and return an Int " in {
      ArrayParity.parity(List(1,-1,2,2)) mustEqual 2
    }


  }

}
