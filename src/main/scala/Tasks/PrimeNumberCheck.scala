package Tasks

object PrimeNumberCheck {

  def main(args:Array[String]): Unit ={
    print("Enter a number: ")
    var a:Int = scala.io.StdIn.readInt()
    println(check(a))
  }

  def check(a:Int): String ={
    var b: String = s"$a is a Prime number"
    if(a<=1){ b = s"$a is NOT a Prime number" }
    else if(a==2){}
    else{
      for(i <- 2 until a-1){
        if(a%1 == 0){
          b = s"$a is NOT a Prime number"
        }
      }
    }
    b
  }
}
