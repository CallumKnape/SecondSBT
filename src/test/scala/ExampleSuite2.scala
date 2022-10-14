import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.BeforeAndAfter

import scala.collection.mutable.{Stack}
import collections.ScalaCollection

class ExampleSuite2 extends AnyFunSuite with BeforeAndAfter{

  var s = ""
  before{
    //Happens before each test case, so if the first test case changes the value of s,
    //s will be reset back to this right before the next test case is executed
    val s = "hi"
  }
  test("1pop is invoked on non empty stack"){

    assert(ScalaCollection.result === 2)
    assert(ScalaCollection.stack.size === ScalaCollection.oldSize-1)
  }
  test("1pop is invoked on an empty stack"){
    val emptyStack=new Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("1testing index out of bound"){

    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("1Testing indexoutofbound with message"){

    val thrown=intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    //  println()
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }


  after{
    //After each test case, do this. Similar to finally.
    println("Welcome to jhinesh world")
  }
}
