package collections

object MapTest extends App{

  var map = Map(("A","Apple"),("B","Banana"),("C","Cherry"))
  var map2= Map("A" -> "Apple", "B" -> "Banana", "C" -> "Cherry")

  var map3: Map[String,String] = Map.empty[String,String]

  println(map)
  println(map2)
  println(map3)
  println(map("B"))

  map2 = map2 + ("D" -> "Durian")
  println(map2)

  map2 = map2-("B")
  println(map2)
}
