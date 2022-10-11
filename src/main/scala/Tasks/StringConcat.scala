package Tasks

object StringConcat {

  println("What is your first name?")
  var firstName: String = scala.io.StdIn.readLine()

  println("What is your surname?")
  var surname: String = scala.io.StdIn.readLine()

  var fullName = firstName + " " + surname


}
