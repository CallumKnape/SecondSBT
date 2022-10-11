package collections
import scala.collection.mutable

class MainTrialTest{

  var set1: mutable.TreeSet[Int] = mutable.TreeSet(0,0,0,1,1,1,1,2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,4,5,5) //An empty set
  var games: Set[String] = Set("Cricket","Football","Hockey","Golf","Golf")
  println(set1)
  println(games)

}

object MainTrialTest extends App{
  new MainTrialTest()
}