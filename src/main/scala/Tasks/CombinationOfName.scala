package Tasks

//This didn't work

object CombinationOfName {

  def main(args:Array[String]): Unit ={

    print("Enter your name: ")
    var a: String = scala.io.StdIn.readLine()

    var seq: Seq[Char] = Seq()
    //Make an array instead?
    var arr: Array[Char] = a.toCharArray

    println()
    recursive(arr,0)

  }

  def recursive(name:Array[Char], startPos:Int): Unit ={
    if(startPos == name.length-1){
      return
    }

    var backup: Array[Char] = name

    //println(name.toString)
    for(a<- 0 until name.length){//}; if a != startPos){
      /*var l: Char = name(startPos)
      name(startPos) = name(a)
      name(a) = l
      println(name.mkString)
      name(a) = name(startPos)
      name(startPos) = l
       */
      var l: Char = name(0)
      name(0) = name(a)
      name(a) = l
      println(name.mkString)
      name(a) = name(0)
      name(0) = l
    }

    var p: Char = backup(startPos)
    backup(startPos) = backup(startPos+1)
    backup(startPos+1) = p

    recursive(backup, startPos+1)
  }

  //Create a recursive method. It needs to know the starting position for which it needs to swap letters with
  //and the current form of the name.
  //eg. Round 1:
  //Callum, 1
  //It proceeds to do the loop 5 times, because 6 letters in Callum. On each loop, it swaps C with one of the
  //later letters in the name. It shouldn't have to worry about earlier, right? That was covered by an earlier loop?

  //aCllum, 2
  //Now C gets swapped with later letters in the name.

  //Is this right? I feel like I might be forgetting something...
  //alClum, 3


}
