package Patterns

object MixTypes {

  def main(args: Array[String]): Unit = {
    var result = search("hello")
    println(result)
  }

  def search(a:Any):Any = a match{
    case 1 => println("One"); 75
    case "two" => println("2"); 76
    case "hello" => println("How are you?"); 77
    case 5.77 => println("5.77"); 78
    case _ => println("Wait, what did you try?"); 79

  }

}
