name := "clinical-nlp-spark-transforms"

version := "0.1"

scalaVersion := "2.13.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.2.0",
  "org.apache.spark" %% "spark-sql" % "3.2.0"
)