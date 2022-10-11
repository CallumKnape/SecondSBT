package exception

class ThrowException {

  def validate(age:Int): Unit = {
    if (age < 18) {
      throw new ArithmeticException("Get outta here, kid!")
    } else {
      println("Old man lol")
    }
  }
}

object MainObject{

  def main(args:Array[String]): Unit ={
    var e = new ThrowException
    e.validate(10)
  }

}
