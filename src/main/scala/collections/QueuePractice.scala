package collections

//import scala.collection.mutable._
import scala.collection.mutable

object QueuePractice extends App{

  var queue: mutable.Queue[Int] = mutable.Queue[Int](3,34,5,1,77,45,8)
  //var queue2: Queue[Int] = Queue(89,89,89,89,23,4,12,54,12,1,4,6,1)
  println(queue)
  //println(queue2)

  val firstEle = queue.front
  println(firstEle)
  println(queue)

  println("\nEnqueueing and dequeueing\n")

  queue.enqueue(17)
  queue.dequeue
  queue.foreach((element:Int) => {
    print(element + ", ")
  })

  println("\nSorting")
  queue.sorted
  queue.foreach((element:Int) => {
    print(element + ", ")
  })

  println("\nSort with")
  queue.sortWith{ case (v1,v2) => (v1 < v2)}
  queue.foreach((element:Int) => {
    print(element + ", ")
  })

}
