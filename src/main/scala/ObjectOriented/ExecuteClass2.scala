package ObjectOriented

import scala.collection.mutable.HashMap

object ExecuteClass2 extends App{

  var hashmap:HashMap[String,Student2] = HashMap.empty[String,Student2]

  hashmap = hashmap + ("Test" -> new Student2(15,"66667778888"))

  print("Enter your name: ")
  var nm: String = scala.io.StdIn.readLine()
  print("Enter your age: ")
  var ag: Int = scala.io.StdIn.readInt()
  print("Enter your phone number: ")
  var pn: String = scala.io.StdIn.readLine()

  hashmap = hashmap + (nm -> new Student2(ag,pn))

  println("\nUsing foreach on the hashmap")
  hashmap.foreach{
    case (key,value) => println (key + " -> " + value.getDetails)
  }

  var student: Student2 = hashmap.getOrElse(nm,null)

  println("\nSearching specifically for " + nm + ": " + student.getDetails)

}

//Remember that even though the file name is different, if the class name is the same as another class
//anywhere in the same package (scope), it'll cause errors because it can't tell the two apart.
//Overloading won't help that.
class Student1(id:Int=0,name:String=null){
  def show(): Unit ={
    println(s"$id ----> $name")
  }
}

class Student2(age:Int=0,phoneNum:String="00001112222"){
  def getAge: Int ={ age }
  def getPhoneNum: String ={ phoneNum }
  def getDetails: (Int,String) ={ (age,phoneNum) }
}

//Consider this idea for Higher Order Function
//Your method accepts a name, maybe a first name, maybe a full name. It also accepts a method.
//You have a list, or a hashmap with that name and an object with all their other personal info. Age, phone number, address etc.
//When you call the method using the name, it returns something, depending on the method. Will it return their age? Their number?
//All of their info as a tuple or a concatenated string?