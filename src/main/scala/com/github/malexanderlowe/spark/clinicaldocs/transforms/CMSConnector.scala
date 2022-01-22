package com.github.malexanderlowe.spark.clinicaldocs.transforms
import com.github.malexanderlowe.spark.clinicaldocs.utils.SparkSessionWrapper

import scala.collection.immutable.Map
import org.apache.spark.sql.DataFrame


abstract class CMSConnector {

  def withTransformations(source: DataFrame): DataFrame
  def withDataValidation(source: DataFrame): DataFrame

  final def applyTransformation(source: DataFrame): DataFrame = {
    // pipeline for data transformation
    source
      .transform(withTransformations)
      .transform(withDataValidation)
  }
}
