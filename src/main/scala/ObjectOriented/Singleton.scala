package ObjectOriented

object Singleton {

  def main(args:Array[String]): Unit = {
    SingletonObject.hello()
  }
}

object SingletonObject{
  def hello(): Unit ={
    println("Hello, from Singleton")
  }
}