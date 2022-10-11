package ObjectOriented

//Basically, a Scala trait is like a Java interface

//case class CaseClass(parameters)
trait SuperTrait

case class CaseClass1(a:Int,b:Int) extends SuperTrait
case class CaseClass2(a:Int) extends SuperTrait
case object CaseObject extends SuperTrait

object MainCaseClass extends App{

  callCase(CaseClass1(10,14))
  callCase(CaseClass2(16))
  callCase(CaseObject)

  def callCase(f:SuperTrait)= f match{
    case CaseClass1(f,g) => println(s"a=$f b=$g")
    case CaseClass2(f) => println(s"a=$f")
    case CaseObject => println("No argument")
  }

}
