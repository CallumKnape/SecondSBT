package Tasks

object ReverseNumber {

  def main(args:Array[String]): Unit ={

    print("Enter a number. Make it big. : ")
    var a: Long = scala.io.StdIn.readLong()
    var b: String = a.toString
    var c: String = ""

    for(i<- b.length to 1 by -1){
      c = c + b.charAt(i-1)
    }

    var d: Long = c.toLong
    println("And in reverse: " + d)
  }
}
