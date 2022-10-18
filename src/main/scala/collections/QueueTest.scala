package collections

import scala.collection.immutable

object QueueTest extends App{


  def returnFirstElement(q: immutable.Queue[Int]): Int ={
    val firstEle = q.front
    firstEle
  }

}
