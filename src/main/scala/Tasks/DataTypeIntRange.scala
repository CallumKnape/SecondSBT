package Tasks

object DataTypeIntRange {



  def main(args: Array[String]): Unit ={
    var a : Int = 300
    var answer : Boolean = if((a >= 20 && a <=100) || (a==300)) true else false
    println(a + " is between 20 and 100, or is equal to 300: " + answer)

    //println(a + " is between 20 and 100, or is equal to 300: " + checkRange(a))
  }

  /*
  def checkRange(a:Int): Boolean ={
    if((a>=20 && a<=100)||(a==300)){
      true
    }else{
      false
    }
  }
*/


}