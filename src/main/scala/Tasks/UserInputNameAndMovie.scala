package Tasks

object UserInputNameAndMovie extends App {

  println("What is your first name?")
  var firstName: String = scala.io.StdIn.readLine()

  println("What is your surname?")
  var surname: String = scala.io.StdIn.readLine()

  println("What is your favourite movie?")
  var movie: String = scala.io.StdIn.readLine()

  println(s"First name: $firstName\nSurname: $surname \nFavourite movie: $movie")

}
