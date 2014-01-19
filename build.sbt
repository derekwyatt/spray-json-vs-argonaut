name := "spray-json-vs-argonaut"

version := "0.1"

scalaVersion := "2.10.3"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies := Seq(
  "io.argonaut"       %% "argonaut"       % "6.1-M2",
  "io.spray"          %% "spray-json"     % "1.2.5",
  "io.spray"          %% "spray-json"     % "1.2.5",
  "com.typesafe.play" %% "play-json"      % "2.2.1",
  "org.json4s"        %% "json4s-jackson" % "3.2.6",
  "org.json4s"        %% "json4s-native"  % "3.2.6",
  "org.parboiled"     %% "parboiled"      % "2.0-M1",
  //"org.parboiled"     %% "examples"       % "2.0-M1",
  "org.scalatest"     %% "scalatest"      % "2.0" % "test"
)

testOptions in Test += Tests.Argument("-oD")

parallelExecution in Test := false
