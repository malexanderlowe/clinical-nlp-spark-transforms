package com.github.malexanderlowe.spark.clinicaldocs.transforms

import com.github.malexanderlowe.spark.clinicaldocs.utils.SparkSessionWrapper
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, split}


object Icd10PcsConnector extends CMSConnector {

  def withTransformations(source: DataFrame): DataFrame = {
    source.select(
      split(
        col("value"), " ").getItem(0).as("ICD10"),
      split(
        split(col("value"), " ", limit=2).getItem(1),",")
        .getItem(0).as("Description")
    )
  }

  def withDataValidation(source: DataFrame): DataFrame = {
    // Pass w/o validation
    source
  }
}
