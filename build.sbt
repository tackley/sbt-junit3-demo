libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.8" % "test",
  "junit" % "junit" % "4.7" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
