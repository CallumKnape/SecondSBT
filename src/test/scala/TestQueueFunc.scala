import org.scalatest.funsuite.AnyFunSuite
import collections.QueueTest
import scala.collection.immutable.Queue

class TestQueueFunc extends AnyFunSuite{

  test("Check queue front element"){
    val q = new QueueTest
    val initialiseQueue = Queue(1,2,3,4,5,6,7,8,9)
    assert(q.returnFirstElement === 1)

  }

}
