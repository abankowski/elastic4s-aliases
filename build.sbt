name := "elastic4s-aliases"

version := "0.1"

scalaVersion := "2.12.3"

val elastic4sVersion = "5.5.0"
libraryDependencies ++= Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sVersion,
  "com.sksamuel.elastic4s" %% "elastic4s-http" % elastic4sVersion,
  "com.sksamuel.elastic4s" %% "elastic4s-http-streams" % elastic4sVersion
)