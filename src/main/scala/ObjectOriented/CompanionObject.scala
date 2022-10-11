package ObjectOriented

class CompanionClass{
  def hello(): Unit = {
    println("This is a companion class")
  }
}

object CompanionObject extends App{
  new CompanionClass().hello()
  println("Companion object")


}
