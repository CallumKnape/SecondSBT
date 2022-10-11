package Inheritance

object BasicsInheritance extends App{

  new Businessman
  new Programmer

}

class Employee{
  var salary: Float = 50000
}

class Programmer extends Employee{
  var bonus: Float = 25000
  salary = 71500
  println(bonus)
  println(salary)
}

class Businessman extends Employee{
  var bonus: Float = 9000
  salary = 65000
  println(bonus)
  println(salary)
}

