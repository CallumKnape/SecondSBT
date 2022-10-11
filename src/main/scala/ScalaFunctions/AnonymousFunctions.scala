package ScalaFunctions

object AnonymousFunctions extends App{

  var result1 = (a:Int, b:Int) => a+b
  println(result1(3,6))

  var result2 = (_:Int)+(_:Int)
  println(result2(12,26) + " " + result2)

  var result3 = (_:Double)+(_:Double)
  println(result3(40.5,17.8))

}
