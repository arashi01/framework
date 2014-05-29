import Dependencies._

organization in ThisBuild          := "net.liftweb"

version in ThisBuild               := "3.0-SNAPSHOT"

homepage in ThisBuild              := Some(url("http://www.liftweb.net"))

licenses in ThisBuild              += ("Apache License, Version 2.0", url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

startYear in ThisBuild             := Some(2006)

organizationName in ThisBuild      := "WorldWide Conferencing, LLC"

scalaVersion in ThisBuild          := "2.10.4"

crossScalaVersions in ThisBuild    := Seq("2.11.1", "2.10.4")

libraryDependencies in ThisBuild  ++= Seq(specs2, scalacheck)

// Settings for Sonatype compliance
pomIncludeRepository in ThisBuild  := { _ => false }

publishTo in ThisBuild            <<= isSnapshot(if (_) Some(Opts.resolver.sonatypeSnapshots) else Some(Opts.resolver.sonatypeStaging))

scmInfo in ThisBuild               := Some(ScmInfo(url("https://github.com/lift/framework"), "scm:git:https://github.com/lift/framework.git"))

pomExtra in ThisBuild              ~= (_ ++ {Developers.toXml})

credentials in ThisBuild           += Credentials(BuildPaths.defaultGlobalBase / ".credentials")

initialize <<= (name, version, scalaVersion) apply printLogo
