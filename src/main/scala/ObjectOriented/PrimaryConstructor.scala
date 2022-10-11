package ObjectOriented

class PrimaryConstructor(id:Int, name:String) {
  def showDetails(): Unit ={
    println(id + " " + name)
  }

}

object temp extends App{
  var s = new PrimaryConstructor(5,"Yeah")
  s.showDetails()
}