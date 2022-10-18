ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SecondSBT"
  )

libraryDependencies += "org.scala-sbt" %% "util-control" % "1.7.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.14" % Test
libraryDependencies += "joda-time" % "joda-time" % "2.12.0"
libraryDependencies += "org.joda" % "joda-convert" % "2.2.2"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

//val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
//val utilControl = "org.scala-sbt" %% "util-control" % "1.7.2"
//libraryDependencies ++= Seq(scalaLogging,utilControl)
