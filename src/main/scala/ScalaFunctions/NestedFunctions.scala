package ScalaFunctions

object NestedFunctions extends App{

  def add(a:Int, b:Int, c:Int)= {
    def add2(x:Int, y:Int) ={
      println(x+y)
      x+y
    }
    add2(a,add2(b,c))
  }

  var result = add(15,27,42)
  println(result)


}
