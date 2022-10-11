package Tasks

object UserInput {

  def main(args: Array[String]): Unit = {

    print("Enter your name: ")
    var name: String = scala.io.StdIn.readLine()

    print("Enter your age: ")
    var age: Int = scala.io.StdIn.readInt()

    println("So your name is " + name + " and you're " + age + " years old")
  }

}
