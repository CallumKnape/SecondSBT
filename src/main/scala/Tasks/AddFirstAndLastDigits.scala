package Tasks

object AddFirstAndLastDigits {

  def main(args: Array[String]): Unit ={

    print("Enter a number. Make it big.: ")
    var a: Long = scala.io.StdIn.readLong()

    var b: String = a.toString
    var c: Int = b.charAt(0).toInt - 48
    var d: Int = b.charAt(b.length-1).toInt - 48

    println("The first and last digits add up to: " + (c+d))
  }
}
