name := "spray-example"

version := "0.1.0"

scalaVersion := "2.11.4"

Revolver.settings

val sprayV = "1.3.2"
val akkaV = "2.3.7"

libraryDependencies ++= Seq(
  "io.spray" 					%% "spray-can" 			% sprayV,
  "io.spray" 					%% "spray-routing" 	% sprayV,
  "io.spray" 					%% "spray-httpx" 		% sprayV,
  "io.spray" 					%% "spray-json" 		% "1.3.1",
  "com.typesafe.akka" %% "akka-actor" 		% akkaV
)