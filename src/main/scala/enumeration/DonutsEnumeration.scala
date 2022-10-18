package enumeration

object DonutsEnumeration extends App{

  object Donut extends Enumeration{

    type Donut = Value
    val Glazed = Value("Glazed")
    val Strawberry = Value("Strawberry")
    val Vanilla = Value("Vanilla")

  }


  //********************************************************************************************
  //This is basically how you give enum values a method to call
  //Check the Test.values.foreach on line 50 or so for the actual method call
  //********************************************************************************************
  object Test extends Enumeration{

    type Test = Value
    val first = new WhatTheHeck{
      val num = 1
      def aMethod: Any = { println("The first value")}
    }
    val second = new WhatTheHeck{
      val num = 7
      def aMethod: Any = { println("The second value")}
    }
    val third = new WhatTheHeck{
      val num = 14
      def aMethod: Any = { println("The third value")}
    }

    protected abstract class WhatTheHeck extends Val(){
      val num: Int
      def aMethod: Any
    }
    implicit def valueToProgress(valu: Value) = valu.asInstanceOf[WhatTheHeck]
  }

  println(s"Vanilla donut value ${Donut.Vanilla}")
  Donut.values.foreach{
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"$d is cool")
    case _ => None
  }

  println
  Test.values.foreach{
    case d => d.aMethod
  }

  println(Test.second.aMethod)

}
