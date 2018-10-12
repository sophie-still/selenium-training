import play.core.PlayVersion

name := "selenium-training"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "info.cukes" %% "cucumber-scala" % "1.2.5",
  "info.cukes" % "cucumber-junit" % "1.2.5",
  "org.seleniumhq.selenium" % "selenium-java" % "3.4.0",
  "com.typesafe.play" %% "play-test" % PlayVersion.current,
  "org.scalatest" %% "scalatest" % "3.0.5"
)