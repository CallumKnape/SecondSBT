package exception

class ExceptionTest3{

  var arr = Array(1,2)

  def divide(a:Int,b:Int): Unit ={
    try{
      a / b
      //var arr = Array(1,2)
      arr(0) += 10
      arr(1) += 45
      arr(10)
    }catch{
      case e: ArithmeticException => System.err.println(e)
      case exp: Exception => System.err.println("Exception triggered: " + exp)
      case th: Throwable => System.err.println("Throwable triggered: " + th)
        //Assume that an error happens that isn't caught by anything in this catch block.
        //Finally will still trigger, but everything else afterwards won't, because the error
        //closed the program. Comment out exp and th to see.
    }finally{
      println(arr(0) + " " + arr(1))
    }
  }
}

object TestObject3 extends App{
  new ExceptionTest3().divide(100,10)
}
