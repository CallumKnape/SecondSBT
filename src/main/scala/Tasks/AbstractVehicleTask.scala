package Tasks

abstract class Vehicle{
  var make: String //a public make property of type String
}

case class Car(mk: String) extends Vehicle{
  override var make: String = mk
}

case class Bike(mk: String) extends Vehicle{
  override var make: String = mk
}

object VehicleReport{
  def printVehicles(lv: List[Vehicle]): Unit ={
    lv.foreach{ println }
  }
}

object AbstractVehicleTask extends App{

  var list: List[Vehicle] = List[Vehicle]()

  list = list :+ (new Car("bmw 3 series"))
  list = list :+ (new Car("vw golf"))
  list = list :+ (new Bike("bmw g 310 r bike"))
  list = list :+ (new Bike("fire storm bike"))

  VehicleReport.printVehicles(list)

}
