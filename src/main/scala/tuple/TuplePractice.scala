package tuple

object TuplePractice extends App{

  var tuple = (1,4,7,9,3)
  var tuple2 = ("Apple","Banana","Orange")
  var tuple3 = (3,9,1,3,4,0,1,4,7)
  var tuple4 = (9,1,6,5,"Germany",7.1)
  println(tuple)
  println(tuple2)
  println(tuple3)
  println(tuple4)

  println
  println(tuple3.productArity)
  println(tuple4.productElement(4))
  tuple2.productIterator.foreach(x=>print(x + ", "))
  println("\n")

  var (t1,t2,t3,t4,t5) = (100,'c',"Rose",6.03,true)

  println(t1)
  println(t2)
  println(t3)
  println(t4)
  println(t5)


}
