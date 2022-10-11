package Multidimensional

class ArrayExample{
  var arr1 = Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
  var arr2 = Array(Array(11,12,13,14,15),Array(16,17,18,19,20))

  var arr3 = Array.ofDim[Int](2,5)

  def addAndShow(): Unit ={
    for(i <- arr1.indices){
      for(j <- arr1(i).indices){
        arr3(i)(j) = (arr1(i)(j) + arr2(i)(j))
        print(arr3(i)(j) + " ")
      }
      println()
    }
  }

}

object AdditionMultiDim extends App{

  var a = new ArrayExample
  a.addAndShow()
}
