package streamScala

import scala.collection.immutable.Stream._

object AnotherStream extends App{

  val stream2: Stream[Int] = cons(1,cons(2,cons(3,Stream.empty)))
  println(stream2)

}
