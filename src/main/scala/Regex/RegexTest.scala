package Regex

object RegexTest extends App{

  val str = "to".r
  val art = "Goodbye to everyone".r
  val source = "Hello to someone out there in the world"

  println(art.findFirstIn(source))
  println(str.findAllIn(source))
  str.findAllIn(source).foreach(x=>println(x))

  //Seems like a . inside a regex string is like a single character wildcard,
  //while * is an any length wildcard
  val needChange = "ReplaceText"
  val finalStr = needChange.replaceAll(".Text","**")
  println(needChange)
  println(finalStr)

  val strCheck = "Check"
  val finalTempStr = strCheck.matches(".*k")
  println(finalTempStr)

  val sstr = "Something to test this on"
  val finalSstr = sstr.split(".ng",4)
  //What does limit do? (The 4 argument)
  //How many times it'll split the string if the regex is found multiple times


  for(sq <- finalSstr){
    println(s"This is an array, apparently: ${sq}")
  }

}
