
import org.joda.time.DateTime
import java.util.Date

object DatePractice extends App{

  var v1 = new Date
  println(v1)

  var v2 = new Date(120,11,24)
  println(v2)

  val v3 = new DateTime()
  println(v3)
}
