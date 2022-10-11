package Tasks

object CharacterSearchInString extends App {

  print("Enter any string: ")
  var str: String = scala.io.StdIn.readLine()

  print("Enter the character you want to search for in your string: ")
  var ch: Char = scala.io.StdIn.readChar()

  print("Up to how many of that character would you like to find? ")
  var num: Int = scala.io.StdIn.readInt()

  println(s"Searching for up to $num occurrences of \'$ch\' in \"$str\"")

  var count: Int = 0
  for (a <- str) {
    if (a == ch && count < num) {
      count += 1
    }
  }

  print(s"Found $count occurrences of \'$ch\' in \"$str\". ")
  if (count == num) {
    println(s"There were at least as many $ch\'s as you expected.")
  } else {
    println(s"There were less $ch\'s than you thought.")
  }
}
