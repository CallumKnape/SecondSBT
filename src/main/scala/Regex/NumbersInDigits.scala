package Regex

import scala.util.matching.Regex

object NumbersInDigits extends App{

  val str = "to check digit 520 in string, with a ****ing symbol check"

  //Small d is used for checking digits
  val reg = new Regex("\\d")
  //Capital D represents all non-digits
  val rex = new Regex("\\D")

  println(reg.findAllIn(str).mkString(", "))
  println(rex.findAllIn(str).mkString(", "))

  //Capital S ignores spaces but finds all other characters. Maybe. Have you tried it with symbols?
  val res = new Regex("\\S")
  //Small s finds spaces
  val rem = new Regex("\\s")

  println(res.findAllIn(str).mkString(", "))
  println(rem.findAllIn(str).mkString(", "))


  //Find q or r in the string
  val ret = new Regex("q|r")
  //. means anything. Wildcard. Single character.
  val red = new Regex(".")

  println(ret.findAllIn(str).mkString(", "))
  println(red.findAllIn(str).mkString(", "))

  val book = "A long string that you can pretend\nis a novel, for the purposes of including all 102 types\nof characters and symbols -and dang, that's a lot- to use a regex on"

  //Matches beginning of line
  val reg1 = new Regex("^")
  println("Reg1: " + reg1.findAllIn(book).mkString(", "))

  //Matches end of line
  val reg2 = new Regex("$")
  println("Reg2: " + reg2.findAllIn(book).mkString(", "))

  //Beginning of entire string
  val reg3 = new Regex("\\A")
  println("Reg3: " + reg3.findAllIn(book).mkString(", "))

  //End of entire string, except allowable final line terminator
  val reg4 = new Regex("\\Z")
  println("Reg4: " + reg4.findAllIn(book).mkString(", "))

  //End of entire string
  val reg5 = new Regex("\\z")
  println("Reg5: " + reg5.findAllIn(book).mkString(", "))

  //Matches word characters
  val reg6 = new Regex("\\w")
  println("Reg6: " + reg6.findAllIn(book).mkString(", "))

  //Matches non-word characters
  val reg7 = new Regex("\\W")
  println("Reg7: " + reg7.findAllIn(book).mkString(", "))

  //Matches point where last match finished
  val reg8 = new Regex("\\G")
  println("Reg8: " + reg8.findAllIn(book).mkString(", "))

  //Back-reference to capture group number "n", or matches new lines (What?)
  val reg9 = new Regex("\\n")
  println("Reg9: " + reg9.findAllIn(book).mkString(", "))

  val reg10 = new Regex("$*")
  println("Reg10: " + reg10.findAllIn(book).mkString(", "))


}
