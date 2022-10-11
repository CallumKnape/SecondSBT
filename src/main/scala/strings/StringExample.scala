package strings

class StringExample {

  var s1 = "An example"
  var s2 = "aN example"
  var s3 = "Of" + " something"
  var s4 = "Hello"
  var s5 = " world"
  var s6 = " idea"
  var s7 = s4.concat(s5).concat(s6)

  var s10 = ""
  var s11 = "and on "

  def show(): Unit ={
    //println(s1.equals(s2))
    //println(s2.equals(s3))
    //println(s1.compareTo(s2))
    //println(s2.compareTo(s3))
    //println(s7)

    for(a <- 0 until 10){
      s10 = s10.concat(s11)
    }
    println(s10)
    println(s10.substring(0,15))
  }
}

object StrExample extends App{
  new StringExample().show()
}
