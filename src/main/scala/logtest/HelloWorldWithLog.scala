package logtest

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithLog extends App with LazyLogging {

  logger.info("Hello world")

}
