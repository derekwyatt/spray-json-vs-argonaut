name := "spray-json-vs-argonaut"

version := "0.1"

scalaVersion := "2.10.3"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies := Seq(
  "io.argonaut"       %% "argonaut"   % "6.1-M2",
  "io.spray"          %% "spray-json" % "1.2.5",
  "io.spray"          %% "spray-json" % "1.2.5",
  "com.typesafe.play" %% "play-json"  % "2.2.1",
  "org.parboiled"     %% "parboiled"  % "2.0-SNAPSHOT",
  "org.parboiled"     %% "examples"   % "2.0-SNAPSHOT",
  "org.scalatest"     %% "scalatest"  % "2.0" % "test"
)

testOptions in Test += Tests.Argument("-oD")
