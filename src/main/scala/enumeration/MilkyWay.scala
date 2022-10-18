package enumeration

object MilkyWay extends Enumeration{
  type Planets = Value
  val Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune = Value

  val Pluto = Value(9,"Pluto")
  val Mondas = Value(10,"Mondas")

  val test = (i:Int) => { i * 2 }

  def main(args: Array[String]): Unit = {
    //println(s"The se of values of type planets that milkyway holds ${MilkyWay.values}")
    isMilkyWay(MilkyWay.Mondas)

    isPlanet("Mondas")
    isPlanet("Sylvarant")
  }

  def isMilkyWay(planets: Planets): Unit ={
    println(s"Planet ${planets.id} and ${planets}")
  }

  def isPlanet(planet: String): Unit ={
    val check = MilkyWay.values.toList.map(v => v.toString).contains(planet)
    println(s"Planet $planet is part of the Milky Way: $check")
  }
}





