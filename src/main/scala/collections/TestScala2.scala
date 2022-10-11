package collections

object TestScala2 extends App{

  var games: Set[String] = Set("Cricket", "Football", "Hockey", "Golf", "Golf")
  var games2:Set[String] = Set("Rugby", "Football", "Golf", "Baseball")
  println("games: " + games)
  println("games2: " + games2)
  println("Games contains Football? " + games.contains("Football"))
  println("Games contains Rugby? " + games.contains("Rugby"))

  println("\ngames3 intersects games and games2")
  var games3: Set[String] = games & games2
  println("games3: " + games3)

  println("\ngames3 is now a union of games and games2")
  games3 = games | games2
  println("games3: " + games3)

  println("\ngames3 is now a difference of games and games2")
  games3 = games &~ games2
  println("games3: " + games3)

  println("\ngames3 is now the merging of games and games2")
  games3 = games ++ games2
  println("games3: " + games3)

  games+="Basketball"
  games-="Cricket"

  println("\ngames: " + games)
  println("games without the Basketball: " + (games - "Basketball"))
  println("games again: " + games)

}
