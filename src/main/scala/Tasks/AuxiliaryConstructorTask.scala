package Tasks

class AuxiliaryConstructorTask{

  var firstName: String = ""
  var surname: String = ""
  var age: Int = 0


  def this(firstName: String) {
    this()
    this.firstName = firstName

    println("First name: " + firstName + "\nSurname: " + surname + "\nAge: " + age)

  }

  def this(firstName: String, surname: String) {
    this()
    this.firstName = firstName
    this.surname = surname

    println("First name: " + firstName + "\nSurname: " + surname + "\nAge: " + age)

  }

  def this(firstName: String, surname: String, age: Int) {
    this()
    this.firstName = firstName
    this.surname = surname
    this.age = age

    println("First name: " + firstName + "\nSurname: " + surname + "\nAge: " + age)

  }
}



object AuxiliaryConstructorTask extends App{

  new AuxiliaryConstructorTask("Callum")
  println
  new AuxiliaryConstructorTask("Callum","Knape")
  println
  new AuxiliaryConstructorTask("Callum","Knape",603)

}
