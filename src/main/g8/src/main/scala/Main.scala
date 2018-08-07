import org.apache.spark.{SparkConf, SparkContext}

class Main {

  val conf = new SparkConf()
    .setMaster("local[*]")
    .setAppName("SparkApp")

  val sc = new SparkContext(conf)

  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }

}
