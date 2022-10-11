package Patterns

object WhileLoop extends App {

  var a = 10
  while(a<=20){
    println(a)
    a += 2
  }
  println("Out of the loop, a is now " + a + "\n")

  var b = 10; do{ println(b); b+=2 }while(b<=20)
  println("Out of the do while loop, b is now " + b)
}
