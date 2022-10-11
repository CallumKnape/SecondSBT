package Multidimensional

object MultiArray extends App{

  var a = new JaggedArrayTest

  //a.show()

}

class MultiArrayClass{

  var arr = Array.ofDim[Int](2,2)

  arr(1)(0) = 15

  def show(): Unit ={
    for(i <- 0 to 1){
      for(j <- 0 to 1){
        print(arr(i)(j) + " ")
      }
      println()
    }
  }
}

class MultiArrayTest{

  var arr = Array.ofDim[Int](10,5)

  arr(3) = new Array[Int](7)

  for(a <- arr.indices){
    for(b <- arr(a).indices){
      arr(a)(b) = a+b
      print(arr(a)(b) + " ")
    }
    println()
  }
}

class JaggedArrayTest{

  var arr = new Array[Array[Int]](10)

  for(a <- arr.indices){
    arr(a) = new Array[Int](a)
  }

  for(a <- arr.indices){
    for(b <- arr(a).indices){
      arr(a)(b) = a+b
      print(arr(a)(b) + " ")
    }
    println()
  }

  /*
  for(/* Row */){
    for(/* Column */){
      print(arr(row)(column) + " ")
    }
    println()
  }
  */

}

