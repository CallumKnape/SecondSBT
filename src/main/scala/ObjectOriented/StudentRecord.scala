package ObjectOriented

class StudentRecord (id:Int,name:String){

  def getRecord(): Unit={
    println(id + " " + name)
  }
}

object MainObject extends App{

  var student1 = new StudentRecord(101,"abc")
  var student2 = new StudentRecord(202,"def")
  student1.getRecord()
  student2.getRecord()

}
