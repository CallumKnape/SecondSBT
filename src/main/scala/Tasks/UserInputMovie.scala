package Tasks

object UserInputMovie extends App {

  println("What is your favourite movie of all time?")
  var movie: String = scala.io.StdIn.readLine()

  println(s"\n\"$movie\" is totally awesome!")

}
