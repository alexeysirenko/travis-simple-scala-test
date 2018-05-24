name := "config-test"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

mainClass in Compile := Some("Application")