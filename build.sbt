lazy val root = (project in file("."))
  .aggregate(core,jniIntegration)

lazy val core = project
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test,
    sbtJniCoreScope := Compile
  )
  .dependsOn(jniIntegration)


lazy val jniIntegration = (project in file("jni-integration"))
  .settings(name := "jni-integration")
  .settings(nativeCompile / sourceDirectory := baseDirectory.value)
  .enablePlugins(JniNative)