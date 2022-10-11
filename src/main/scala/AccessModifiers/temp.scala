package AccessModifiers

class temp {
  private[this] def isTemp = true
  /*def isTemp(other:temp): Unit ={
    if(other.isTemp())
  }*/
  def getTemp(): Unit = {
    isTemp
  }

}

object privateObject{

}
