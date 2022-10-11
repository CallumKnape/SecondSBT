package Patterns

object LoopsContinuous extends App{

  var a = 10
  while(true){
    println(a)
    a+=2
    //This is dangerous. Enjoy your eternal loop!
    //Integer overflow? It'll change to Long and keep going further
  }
}
