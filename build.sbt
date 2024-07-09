import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Recsys",
    libraryDependencies += munit % Test
    libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.34.0"
    libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.3"
    libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3"
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
