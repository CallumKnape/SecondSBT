package Patterns

object MatchNumbers extends App{

  var a = 3
  a match {
    case 1 => a = a + 32
              println(a)
    case 2 => a = a * 32
              println(a)
    case 3 => a = a / 32
              println(a)
    case _ => println("What the heck?")
  }
}
