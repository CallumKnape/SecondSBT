package Tasks

import java.util.Currency

object DonutActivity extends App {

  val formatter = java.text.NumberFormat.getCurrencyInstance
  val currency = Currency.getInstance("USD")
  formatter.setCurrency(currency)

  println("How many donuts do you want to buy?")
  var quantity: Int = scala.io.StdIn.readInt()
  var price: Double = 2.5 //Equal to 2.50, before currency formatting
  var cost: Double = price * quantity

  var string: String = "The total cost of " + quantity + " Glazed Donuts is " + formatter.format(cost)

  println(string)
}
