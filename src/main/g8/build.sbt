// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12",
      resolvers ++= Seq(
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
      ),
      libraryDependencies := Seq(
        "org.apache.spark" %% "spark-core" % "2.3.1",
        "org.apache.spark" %% "spark-mllib" % "2.3.1",
        "org.scalanlp" %% "breeze" % "0.13.2",
        "org.scalanlp" %% "breeze-natives" % "0.13.2"
      )
    )),
    name := "scala-spark.g8"
  )
