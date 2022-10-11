package Tasks

object IsNumNegOrPos {

  def main(args: Array[String]): Unit ={
    print("Enter a number: ")
    var a: Int = scala.io.StdIn.readInt()

    if(a>=0){
      println("Your number is positive")
    }else{
      println("Your number is negative")
    }

  }

}
