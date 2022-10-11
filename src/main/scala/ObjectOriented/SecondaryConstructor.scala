package ObjectOriented

//Args are mutable ie. Cannot be changed from within class

class SecondaryConstructor(id:Int, name:String) {
  var age:Int = 0
  var addr: String = _
  def showDetails(): Unit ={
    //println(id + " " + name + " " + age + " " + addr)
    if("".equals(addr)||addr == null){
      detailsWithoutAddr()
    }else{
      detailsWithAddr()
    }
  }

  def detailsWithoutAddr(): Unit ={
    println(id + " " + name + " " + age + ". No address found.")
  }

  def detailsWithAddr(): Unit ={
    println(id + " " + name + " " + age + " " + addr)
  }

  def this(id:Int, name:String, age:Int){
    this(id,name)
    this.age=age
  }

  def this(id:Int, name:String, age:Int, addr:String){
    this(id,name)
    this.age=age
    this.addr=addr
  }
}

object MainTwo extends App{

  var s = new SecondaryConstructor(1,"Yeah",8)
  s.showDetails()

  var y = new SecondaryConstructor(5, "Wat", 17, "Location")
  y.showDetails()
}


