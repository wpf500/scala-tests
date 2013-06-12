import sbt._
import Keys._

object HelloBuild extends Build {
  lazy val root = Project("root", base=file("."))
}