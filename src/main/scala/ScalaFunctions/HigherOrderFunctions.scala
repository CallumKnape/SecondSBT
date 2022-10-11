package ScalaFunctions

import ScalaFunctions.functionCall

object HigherOrderFunctions {
  def main(args: Array[String]): Unit ={
    functionExample(25,multiplyBy2)
    var e = recursiveTest(15,functionCall.functionExamModifiedOne)
    println(e)
  }

  //Higher order function. In f's case here, it expects a method that accepts an Int and returns an AnyVal
  def functionExample(a:Int, f:Int=>AnyVal): Unit ={
    println(f(a))
  }

  def multiplyBy2(a:Int): Int ={
    a*2
  }

  def doubleVal(a:Int): Int ={
    a*2
  }

  def recursiveTest(a:Int, f:(Int,Int)=>Int): Int ={
    f(a,79)
  }


}
