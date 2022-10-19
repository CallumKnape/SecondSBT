package threads

object threadPriority extends App{

  var t1 = new CreateThread()
  var t2 = new CreateThread()
  var t3 = new CreateThread()
  var t4 = new CreateThread()

  println("t1 priority: " + t1.getPriority)
  println("t2 priority: " + t2.getPriority)
  println("t3 priority: " + t3.getPriority)
  println("t4 priority: " + t4.getPriority)


  t1.setPriority(6)
  t2.setPriority(3)
  t3.setPriority(10)
  t4.setPriority(5)

  println("t1 priority: " + t1.getPriority)
  println("t2 priority: " + t2.getPriority)
  println("t3 priority: " + t3.getPriority)
  println("t4 priority: " + t4.getPriority)

  t1.start()
  t2.start()
  t3.start()
  t4.start()


}
