package Operators

object OperatorsPractice extends App{

  var a = 10
  var b = 20
  var c = true
  var d = false
  var result = 0

  //Arithmetic
  println("Adding a and b: " + (a+b))
  println("Subtracting a from b: " + (b-a))

  //Relation
  if(a > b){
    println("a is greater than b")
  }else{
    println("b is greater than a")
  }

  if(a < b){
    println("a is less than b")
  }else{
    println("b is less than a")
  }

  if(a >= b){
    println("a is greater than or equal to b")
  }else{
    println("b is greater than a")
  }

  if(a <= b){
    println("a is less than or equal to b")
  }else{
    println("b is less than a")
  }

  if( a != b){
    println("a does NOT equal b")
  }else{
    println("a is equal to b")
  }

  //Logical
  if (a == b) {
    println("a is equal to b")
  } else {
    println("a is NOT equal to b")
  }

  println("Logical or of c||d is: " + (c||d))
  println("Logical and of c&&d is: " + (c&&d))

  //Bitwise AND operator
  result=a&b
  println("Bitwise AND result: " + result)

  //Bitwise OR
  result=a|b
  println("Bitwise OR result: " + result)

  //Bitwise XOR
  result=a^b
  println("Bitwise XOR result: " + result)

  //Assignment operator
  println("Addition assignment is: " + (a+=b))

  //What's going on?
  println("Experiment: " + (a&b))

}
