ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

lazy val root = (project in file("."))
  .settings(
    name := "point-in-triangle"
  )