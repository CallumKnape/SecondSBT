package readingFromFile

import scala.io.Source

object ReadFileContents extends App{

  val filepath = "/Users/callum/Desktop/TextFileForScala.txt"

  println(Source.fromFile(filepath).mkString)

  Source.fromFile(filepath).getLines().foreach(z => println("Line content is " + z))

  Source.fromFile(filepath).getLines().take(1).foreach(println)

  Source.fromFile(filepath).getLines().slice(0,2).foreach(println)

  println(Source.fromFile(filepath).getLines().toList)
}
