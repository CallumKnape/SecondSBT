import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite{

  test("CubeCalculator.cube()") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("testFunSuite.TestStrings.str()"){
    assert(testFunSuite.TestStrings.str().equals("Test"))
  }

}
