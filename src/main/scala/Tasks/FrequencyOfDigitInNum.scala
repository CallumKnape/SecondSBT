package Tasks

object FrequencyOfDigitInNum {

  def main(args:Array[String]): Unit ={

    print("Enter a number. Make it big.: ")
    var a: Long = scala.io.StdIn.readLong()
    var b: String = a.toString

    var occurrences: Array[Int] = Array(0,0,0,0,0,0,0,0,0,0)

    for(x<- 0 until b.length){
      var c = b.charAt(x) - 48
      occurrences(c) += 1
    }

    println("Digit | Occurrences in your number")
    var z: Int = 0
    for(y <- occurrences){
      println(z + ": " + y)
      z+=1
    }
  }
}


