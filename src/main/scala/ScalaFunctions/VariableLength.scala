package ScalaFunctions

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder

//Variable length parameters
object VariableLength extends App{

  def divide(bleh:Int*): Int ={
    var sum=2147483647
    for(a<- bleh){
      sum /= a
    }
    sum
  }

  def multiply(eh:Int*): Int ={
    var sum=1
    for(a<- eh){
      sum *= a
    }
    sum
  }

  var sumD = divide(1,2,3,4,5,6,7,8,9)
  println("Divide result: " + sumD)

  var sumM = multiply(1,2,3,4,5,6,7,8,9)
  println("Multiply result: " + sumM)

  println(40.getClass)


}
