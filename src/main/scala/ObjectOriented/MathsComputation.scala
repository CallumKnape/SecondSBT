package ObjectOriented

class MathsComputation {
  def add(a:Int, b:Int): Unit ={
    println("Int edition: " + (a+b))
  }

  def add(a:Long, b:Long): Unit ={
    println("Long edition: " + (a+b))
  }

  def add(a:Double, b:Double): Unit ={
    println("Double edition: " + (a+b))
  }

  def add(a:Float, b:Float): Unit ={
    println("Float edition: " + (a+b))
  }

  def add(a:Int, b:Int, c:Int): Unit ={
    println(a+b+c)
  }
}

object MainTh extends App{
  var a = new MathsComputation()
  a.add(2,3,4)
  a.add(7,8)
  a.add(45l,67l)
  a.add(5.5,7.2)
  a.add(2.1f,9.3f)
  a.add(4.5f,17.1)
}