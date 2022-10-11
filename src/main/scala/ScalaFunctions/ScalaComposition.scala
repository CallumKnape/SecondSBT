package ScalaFunctions

object ScalaComposition {

  def main(args: Array[String]): Unit = {
    val result = multiplyBy2(multiplyBy3(add(2)))
    println(result)
  }

  def add(a:Int):Int={
    a+2
  }

  def multiplyBy3(a:Int):Int={
    a*3
  }

  def multiplyBy2(a:Int):Int={
    a*2
  }
}
