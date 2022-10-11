package Tasks

class IntArrayRemoveDuplicates {
  //var nums: Array[Int] = Array(1,1,2)
  //var expectedNums: Array[Int] = Array(1,2,0)
  //var nums: Array[Int] = Array(0,0,1,1,1,2,2,3,3,4)
  //var expectedNums: Array[Int] = Array(0,1,2,3,4,0,0,0,0,0)
  var nums: Array[Int] = Array(7,2,4,4,2,9,8,7,2,3)
  //var expectedNums: Array[Int] = Array(7,2,4,9,8,3,0,0,0,0)

  var k: Int = removeDuplicates(nums)

  def removeDuplicates(in: Array[Int]): Int = {
    var n: Array[Int] = new Array[Int](in.length)
    var c: Int = 0
    var nilCheck: Boolean = false

    println(n.mkString(", "))

    for(a <- in){
      if(a==0 && !nilCheck){
        n(c) = a
        nilCheck = true
        c += 1
      }
      if(n.contains(a)){
      }else{
        n(c) = a
        c += 1
      }
    }

    println(n.mkString(", "))
    return n.length
  }
}

object MainIntArrayRemove extends App{
  new IntArrayRemoveDuplicates
}
