package collections

object vectorPlay extends App{

  var list1to100 = (1 to 100).toList
  list1to100.foreach(println)

  //Both work
  //.toSet
  //.toArray
  val setFrom1to300 = (1 to 300).toSet
  println(setFrom1to300)

  val arrayFrom1to300 = (1 to 300).toArray
  arrayFrom1to300.foreach(print(_))

  val seqFrom1to300 = (1 to 300).toSeq
  seqFrom1to300.foreach(print(_))

  val setFromAtoZ = ('a' to 'z').toSet
  println(setFromAtoZ)
  //seqFromAtoZ.foreach(print(_))

}
