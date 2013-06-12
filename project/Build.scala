import sbt._
import Keys._

object HelloBuild extends Build {
  lazy val root = Project("root", base=file("."))
    .settings(scalaVersion := "2.10.1", version := "1.0")
    .settings(libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % "2.2.1",
      "javax.servlet" % "servlet-api" % "2.5" % "provided"
    ))
}
