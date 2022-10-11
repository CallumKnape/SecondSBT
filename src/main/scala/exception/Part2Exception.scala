package exception

object MainExceptTest extends App{
  new Part2Exception().divide(100,10)
}

class Part2Exception {

  def divide(a:Int,b:Int): Unit ={
    try {
      a / b
      var arr = Array(1,2)
      arr(10)
    }catch{
      case e: ArithmeticException => System.err.println(e)
      //I mean, technically, Throwable can just catch every error that you didn't specifically catch.
      //I'm sure you did something like this before, with some parent Error class at the end of
      //an if else in a Java catch block
      case ex: Throwable => System.err.println("Found something unknown: " + ex)
    }finally {
      println("At least Finally happens")
    }

  }
}
