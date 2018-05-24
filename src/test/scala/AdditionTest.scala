class AdditionTest extends org.scalatest.FunSuite {

  test("Should add 2 and 2 correctly") {
    val addition = new Addition
    assert(addition.add(2, 2) == 4)
  }

}
