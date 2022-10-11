package ObjectOriented

class Arithmetic {

  def add(a:Int,b:Int): Unit = {
    var add=a+b
    println("sum: " + add)
  }
}

object mainObj extends App{

  new Arithmetic().add(10,14)

}
