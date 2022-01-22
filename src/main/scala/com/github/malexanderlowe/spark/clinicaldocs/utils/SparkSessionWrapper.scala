package com.github.malexanderlowe.spark.clinicaldocs.utils
import org.apache.spark.sql.SparkSession

trait SparkSessionWrapper extends Serializable {
  lazy val  spark = SparkSession
    .builder()
    .appName("Clinical Doc Spark Session")
    .config("spark.master", "local")
    .getOrCreate()
}
