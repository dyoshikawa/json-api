val ScalatraVersion = "2.6.3"

organization := "net.dyosh"

name := "Household Accounts"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "com.h2database" % "h2" % "1.4.196",
  "com.mchange" % "c3p0" % "0.9.5.2",
  "com.typesafe" % "config" % "1.3.1",
  "org.scalatra" %% "scalatra-auth" % "2.6.3"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
