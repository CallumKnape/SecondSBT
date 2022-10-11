package ScalaFunctions

object functionCall {
  def main(args: Array[String]): Unit ={
    var result = functionExamModifiedOne
    println(result)

    var arg = functionExamModifiedOne(5,6)
    println(arg)

    var test : Long = functionTest(15)
    println(test)
  }

  def functionExam(): Unit ={
    println("Simple function call")
  }

  def functionExamModifiedOne(): Int = {
    var a = 10 / 7
    a
  }

  def functionExamModifiedOne(a:Int,b:Int) ={
    var c = (a+b)
    c
  }

  def functionTest(a:Int) = {
    if (a.isValidLong) {
      a.toLong
    } else {
      0L
    }
  }
}
