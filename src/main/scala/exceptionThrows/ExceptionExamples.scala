package exceptionThrows

class ExceptionExamples{
  //@throws is an annotation. Kinda like a comment for awareness.
  //Good practice, get used to it.
  @throws(classOf[NumberFormatException])
  @throws(classOf[WhatTheHeckException])
  @throws(classOf[TheSecondException])
  @throws(classOf[TheLastException])
  def validate(i: Int): Unit ={
    //"abc".toInt
    if(i < 18){
      throw new WhatTheHeckException("You're too young")
    }else if(i >= 20 && i < 80){
      throw new TheSecondException("You're a reasonable age")
    }else{
      throw new TheLastException("Gramps!")
    }
  }

}

class WhatTheHeckException(message: String, cause: Throwable = null) extends Exception{
  //message parameter given by throw new
  //Message passed to catch block in case statement
  override def toString: String = super.toString + " ----- " + message
  //println(message)
}

class TheSecondException(message: String, cause: Throwable = null) extends Exception{
  override def toString: String = super.toString + " > " + message
}

class TheLastException(message: String, cause: Throwable = null) extends Exception{
  override def toString: String = super.toString + " Hahaha " + message
}

object ExceptionExamples extends App{

  try {
    new ExceptionExamples().validate(603)
  }catch{
    //Also removes the big block of red "Exception in thread "main"" you'll get on console
    case e: NumberFormatException => println("Number format silliness")
    case e: WhatTheHeckException => println("Exception occured: " + e)
    case e: TheSecondException => println("Second exception: " + e)
    case e: TheLastException => println("Last exception: " + e)
  }finally {
    println("Finally will do something for sure")
  }
}
