ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SecondSBT"
  )

libraryDependencies += "org.scala-sbt" %% "util-control" % "1.7.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

//val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
//val utilControl = "org.scala-sbt" %% "util-control" % "1.7.2"
//libraryDependencies ++= Seq(scalaLogging,utilControl)
