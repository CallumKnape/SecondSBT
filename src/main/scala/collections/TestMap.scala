package collections

object TestMap extends App{

  val s1 = Set(5,1,3,4,7,2)
  val results1 = s1.map(x=> x * x)
  println(results1)

  val s2 = Set("Thomas","Sam","Marcelo","Marie")
  val results2 = s2.map(_.toUpperCase)
  println(results2)
}
