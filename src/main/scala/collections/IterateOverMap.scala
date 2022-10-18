package collections

import scala.collection.immutable.HashMap

object IterateOverMap extends App{

  var hashMap = HashMap("A" -> "Apple", "B" -> "Banana", "C" -> "Cherry")
  hashMap.foreach{
    case(k,v) => println(k + " --- " + v)
  }
  println(hashMap("B"))
  hashMap = hashMap+("D"->"Durian")
  hashMap.foreach{
    case(k,v) => println(k + " --- " + v)
  }
}
