// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12",
      libraryDependencies := Seq(
        "org.apache.spark" %% "spark-core" % "2.3.1",
        "org.apache.spark" %% "spark-mllib" % "2.3.1"
      )
    )),
    name := "scala-spark.g8"
  )
