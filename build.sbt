
name := "AkkaJavaDemo"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.8",
  "com.google.inject" % "guice" % "4.1.0",
  "junit" % "junit" % "4.12" % "test" exclude("hamcrest-core", "org.hamcrest"),
  "com.typesafe.akka" %% "akka-http-testkit" % "2.4.8" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test" exclude("hamcrest-core", "org.hamcrest"),
  "org.hamcrest" % "hamcrest-all" % "1.3" % "test"
)
    