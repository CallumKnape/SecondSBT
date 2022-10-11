package WileyCodeExample

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    /*val data= Map("A" -> 6,
                  "B" -> 25,
                  "C" -> 40,
                  "D" -> 5)
    println(data.mkString(" ||| "))

    case class Person(name:String, isAdult:Boolean)
    val createPerson: (String,Int) => Person = (name,age) => Person(name,age>18)

    val users = data.map(createPerson.tupled)

    println(users)
    */

    /*var age: Int = 21;

    /*if(age>18){
      println("Can vote")
    }else{
      println("Too young to vote")
    }*/

    if (age % 2 == 0) {
      println("Even number: " + age)
    } else {
      println("Odd number: " + age)
    }*/

    var score: Int = 76

    if(score>=0 && score< 40){
      println("Failed")
    }else if(score>=40 && score<50){
      println("3.1 grade")
    }else if(score>=50 && score<60){
      println("2.2 grade")
    }else if(score>=60 && score<70){
      println("2.1 grade")
    }else{
      println("1.1 grade")
    }



  }
}
