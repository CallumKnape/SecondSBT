package ScalaFunctions

object RecursionPractice {

  var total = 0

  def main(args: Array[String]) ={
    var result = function(15,4)
    println(result)

    println(functionExample(2,5) + " " + functionExample(2) + " " + functionExample + " " + functionExample(b=45))
  }

  def function(a:Int,b:Int): Int ={
    if(b == 0){
      0
    }else{
      a+function(a,b-1)
    }
  }

  def test(a:Int,b:Int): Unit ={
    if(b == 0){
      0
    }else{
      total += a
      test(a,b-1)
    }
  }
  /*The two above methods are functionally the same, because the method returns a+val, eg. 15+15.
  Then, the earlier call adds the total of that onto a, so a+val becomes 15+30
  After that, a+val is 15+45, and so on
  */

  def functionExample(a:Int=10,b:Int=20):Int={
    a+b
  }

  def functionExample():Int={
    15
  }

}
