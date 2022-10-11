package Tasks

object ListSequenceOfNum {

  def main(args:Array[String]): Unit ={

    var seq: Seq[Int] = Seq()

    for(a<- 100 until 151){
      seq = seq :+ a
    }

    //println(seq)
    for(ele <- seq){
      println(ele)
    }
  }
}

