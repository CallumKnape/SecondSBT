package collections

import scala.collection.mutable.Stack

object ScalaCollection {

  var stack = new Stack[Int]
  stack.push(1)
  stack.push(2)
  val oldSize = stack.size
  val result = stack.pop()

}
