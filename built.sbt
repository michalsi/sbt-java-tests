// Project name (artifact name in Maven)
name := "CAPD System Tests"

version := "1.0-SNAPSHOT"

description := "CAPD System test project"

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false



// http://mvnrepository.com/artifact/junit/junit
libraryDependencies += "junit" % "junit" % "4.12"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"

//docs https://github.com/sbt/junit-interface
testOptions += Tests.Argument(TestFrameworks.JUnit
//tests to run, Only individual test case names are matched
//, --tests=<REGEXPS>
)