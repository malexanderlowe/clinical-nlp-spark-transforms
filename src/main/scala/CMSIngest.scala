package com.github.malexanderlowe.spark.clinicaldocs

import com.github.malexanderlowe.spark.clinicaldocs.transforms.Icd10PcsConnector
import com.github.malexanderlowe.spark.clinicaldocs.utils.SparkSessionWrapper

object Main extends App with SparkSessionWrapper {
  val df = spark.read.text("/Users/michaellowe/Desktop/mlfeats-cms/icd10pcs_codes_2022.txt")
  val transformed = Icd10PcsConnector.applyTransformation(df)
  print(transformed.show(false))
}
