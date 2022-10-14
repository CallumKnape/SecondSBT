import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable.{Stack}

class ExampleSuite extends AnyFunSuite{

  test("pop is invoked on non empty stack"){
    var stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    val oldSize = stack.size
    val result = stack.pop()
    assert(result===2)
    assert(stack.size === oldSize-1)
  }

  test("pop is invoked on an empty stack"){
    val emptyStack = new Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }

  test("testing index out of bounds"){
    val s = "hi"
    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("Testing indexoutofbounds with message"){
    val s = "hi"
    val thrown = intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }

}
