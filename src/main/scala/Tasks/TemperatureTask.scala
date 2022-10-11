package Tasks

object TemperatureTask {

  def main(args: Array[String]): Unit ={
    print("Enter the first temperature: ")
    var a: Int = scala.io.StdIn.readInt()

    print("Enter the second temperature: ")
    var b: Int = scala.io.StdIn.readInt()

    if((a<0 && b>100 )||(a>100 && b<0)){
      println("One value is below 0 and the other is above 100")
    }else{
      println("The two values didn't line up with the task")
    }
  }
}
