package threads

import org.joda.time.DateTime

class CreateThread extends Thread{

  //var yeah: Int = 0

  override def run(): Unit ={

    try {
      var v3 = new DateTime()
      MainObject.yeah += 1
      println("Do parallel computation here: " + Thread.currentThread().getName + " at time: " + v3)
      Thread.sleep(2000)
      v3 = new DateTime()
      println("Back after sleeping: " + Thread.currentThread().getName + " at time: " + v3)
      println(Thread.currentThread().getName + " did a thing: " + MainObject.yeah)
    }catch{
      case e: Exception => e.printStackTrace()

    }
  }

}


object MainObject extends App{

  var t1 = new CreateThread()
  var t2 = new CreateThread()
  var t3 = new CreateThread()

  var yeah = 0

  t1.start()
  try{
    println("Current thread name is: " + Thread.currentThread().getName)
    //t1.join()
  }catch{
    case e: Exception => e.printStackTrace()
  }


  t2.start()
  try {
    println("Current thread name is: " + Thread.currentThread().getName)
    t2.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }


  t3.start()
  try {
    println("Current thread name is: " + Thread.currentThread().getName)
    t3.join()
  } catch {
    case e: Exception => e.printStackTrace()
  }


  println(t1.getName())

  //You knew this already, but .start() is what makes a Thread a new process that can run individually.
  //Using .run() is just a method call. Not a process thing.

}