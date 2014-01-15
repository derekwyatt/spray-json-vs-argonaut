name := "spray-json-vs-argonaut"

version := "0.1"

scalaVersion := "2.10.3"

libraryDependencies := Seq(
  "io.argonaut" %% "argonaut" % "6.1-M2",
  "io.spray" %% "spray-json" % "1.2.5",
  "org.scalatest" %% "scalatest" % "2.0" % "test"
)

testOptions in Test += Tests.Argument("-oD")
