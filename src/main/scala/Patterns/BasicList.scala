package Patterns

object BasicList extends App{

  var listOfNumbers = List(1,2,3,4,5,6,7,8,9,10)
  BasicList.listOfNumbers.foreach{ println }

  listOfNumbers.foreach(print)
  println

  listOfNumbers.foreach((element:Int)=> print((element+5) + " "))


}
