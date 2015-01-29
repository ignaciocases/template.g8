import sbt._
import sbt.Keys._

import org.scalastyle.sbt.ScalastylePlugin


object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="Camel"$",
    base = file("."),
    settings = Project.defaultSettings ++ ScalastylePlugin.Settings ++ Seq(
      name := "$name;format="Camel"$",
      organization := "$organization$",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.5",
      // add other settings here
      resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
      libraryDependencies ++= Seq(
        // "edu.icases" %% "library" % "0.1-SNAPSHOT",
        "com.chuusai"    % "shapeless_2.11"             % "2.0.0",  
        "org.typelevel"  %% "shapeless-scalacheck"      % "0.3",
        "org.scalaz"     %% "scalaz-core"               % "7.1.0",
        "org.scalaz.stream" %% "scalaz-stream"          % "0.6a",
        "org.specs2"     %% "specs2"                    % "2.4.15"  % "test",
        "org.scalatest"  % "scalatest_2.11"             % "2.2.1"   % "test" withSources() withJavadoc(),
        "org.scalacheck" %% "scalacheck"                % "1.12.1"  % "test" withSources() withJavadoc()
      )
    )
  )
}
