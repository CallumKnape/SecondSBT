package streamScala

object StreamTest extends App{

  val stream = 1 #:: 2 #:: 8 #:: 20 #:: 15 #:: Stream.empty
  println(stream)

  println("Take first 2 numbers from stream")
  stream.take(2).print
  println
  stream.take(10).print
  println
  println(stream.map(_+5))

  var a = stream.take(2)
  println(a.getClass.getSimpleName)

}
