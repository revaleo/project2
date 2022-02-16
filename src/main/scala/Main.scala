import org.apache.spark.sql._
import scala.io.StdIn._

object Main {
  def main(args: Array[String]):Unit = {
    System.setProperty("hadoop.home.dir", "C:\\winutils")

    val spark = SparkSession
      .builder()
      .appName("Project2")
      .config("spark.master", "local")
      .getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    val table = spark.read.json()
  }
}