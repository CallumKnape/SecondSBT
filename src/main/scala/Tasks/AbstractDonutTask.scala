package Tasks

abstract class Donut{
  var pastry: String
  def printName: Unit
}

case class VanillaDonut() extends Donut{
  override var pastry: String = "Vanilla"
  def printName: Unit ={
    println("Vanilla donut")
  }
}

case class GlazedDonut() extends Donut{
  override var pastry: String = "Glazed"
  def printName: Unit ={
    println("Glazed donut")
  }
}

class Pastry[P <: Donut](p: P){
  def name(): Unit ={
    p.printName
  }
}


object AbstractDonutTask extends App{
  var first = new Pastry[VanillaDonut](new VanillaDonut)
  var second = new Pastry[GlazedDonut](new GlazedDonut)

  first.name()
  second.name()
}
