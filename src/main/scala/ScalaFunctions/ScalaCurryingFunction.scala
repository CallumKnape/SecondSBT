package ScalaFunctions

object ScalaCurryingFunction extends App{

  val result1 = add(10)(23)
  println(result1)

  val result2 = add(10)_
  val result3 = result2(17)
  println(result3)

  val test1 = st("Word")_
  val test2 = test1("play")
  println(test2)

  def add(a:Int)(b:Int): Int = {
    a+b
  }

  def st(a:String)(b:String): String = {
    a + " " + b
  }
}
