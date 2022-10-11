package Tasks

class StringTask {

  var s1 = "A sentence formed of multiple words that will later be split apart for nefarious purposes and unknown results"
  var arr: Array[Array[String]] = Array.ofDim[String](9,2)

  for(a <- arr.indices){
    for(b <- arr(a).indices){
      val sTemp: Array[String] = spaceCheck(s1)
      arr(a)(b) = sTemp(0)
      s1 = sTemp(1)
    }
  }

  for(a <- arr.indices){
    for(b <- arr(a).indices){
      println(arr(a)(b))
    }
  }

  var s3: String = arr(0)(0).concat(" ").concat(arr(0)(1)).concat(" ").concat(arr(1)(1)).concat(" ").concat(arr(6)(1)).concat(" ").concat(arr(8)(1))

  println(s3)

  def spaceCheck(sentence: String): Array[String] = {
    var s2 = ""
    for (a <- 0 until sentence.length - 1) {
      if (sentence.charAt(a) == ' ') {
        s2 = sentence.substring(0, a)
        return Array(s2,sentence.substring(a+1))
      }
    }
    Array(sentence,"")
  }
}

object StringTask extends App{
  new StringTask()
}
