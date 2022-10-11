package exception

class ExceptionExample {
  def divide(a:Int,b:Int): Unit ={
    try {
      a / b   //exception occurs
    }catch{
      case doesitwork: ArithmeticException => urgh(doesitwork)
    }
    println("Rest of code is executing")
  }

  def urgh(e:Any): Unit ={
    System.err.println(e)
    println("e.getClass: " + e.getClass)
    println("e.getClass.getSimpleName: " + e.getClass.getSimpleName)
  }
}

object tempCheckException extends App{
  new ExceptionExample().divide(200,0)
}
