package strings.StringInterpolation

object StringInter extends App{

  new StringExample().show()

}


class StringExample{

  var s1 = "Scala training example"
  var version=7.52
  def show(): Unit ={
    //%s used to interpolate another string into this string
    //%2.2f used to tell the float that there should be 2 digits before the decimal, and 2 digits after
    //Below seems like a Scala bug, from what I can find on the error message
    //println(f"Something in America costs $$1.9%2.2f")

    println(f"This is a $s1%s and the Scala version is $version%2.1f")
  }

}