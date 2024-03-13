name := """Aircraft System Final"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.2.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.2.0",
  "mysql" % "mysql-connector-java" % "8.0.26",
  "org.apache.kafka" %% "kafka" % "3.0.0",
  "com.typesafe.akka" %% "akka-http" % "10.2.6",
  "com.typesafe.akka" %% "akka-stream" % "2.6.17",
  "ch.qos.logback" % "logback-classic" % "1.2.6",
  "com.typesafe.play" %% "play-json" % "2.10.0",
  "mysql" % "mysql-connector-java" % "8.0.28",
  "org.apache.spark" %% "spark-core" % "3.5.0",
  "org.apache.spark" %% "spark-sql" % "3.2.0"
)
