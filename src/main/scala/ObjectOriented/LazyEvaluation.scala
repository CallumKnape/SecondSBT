package ObjectOriented

object LazyEvaluation extends App{

  //Lazy won't call the method until the var is called. You might want to delay the call until something else
  //has happened, like contacting a server. You'd want to establish connection before making the call, but at
  //least the method will be saved to var and ready to go before establishment.
  /*lazy val myExpensiveVal = myExpensiveFunction
  val settings: Boolean = true

  if(settings){
    var temp = myExpensiveVal
    println(temp)
  }else{
    println("Sleepy")
  }


  def myExpensiveFunction(): Unit={
    println("What?")
  }*/

  var count: Int = 0
  lazy val sleepy = theLazyFunction()

  def theLazyFunction(): Int ={
    count += 1
    count
  }

  //Despite sleepy being assigned earlier, since it's lazy, it didn't do anything with count yet.
  //As a result, the direct method call acts with count first and returns 1.
  //The lazy val call happens second, saves 2 as the output to the val and immediately outputs that to println.

  //However, if you remove lazy from sleepy's assignment, it acts on count first, saving the output, 1, to the val.
  //The direct method call acts on count second, returning 2. Afterwards, we get the value saved to sleepy, which was 1.
  println(theLazyFunction())
  println("And now for the lazy one")
  println(sleepy)


}
