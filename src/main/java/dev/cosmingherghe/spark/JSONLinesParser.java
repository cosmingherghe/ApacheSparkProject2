package dev.cosmingherghe.spark;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class JSONLinesParser {

    public void parseJsonLines() {
        SparkSession spark = SparkSession.builder()
                .appName("JSON Lines to Dataframe")
                .master("local")
                .getOrCreate();

        Dataset<Row> df = spark.read().format("json")
                .load("src/main/resources/simple.json");

        Dataset<Row> df2 = spark.read().format("json")
                .option("multiline", true)
                .load("src/main/resources/multiline.json");

        System.out.println("\n --- Data Set 1 --- \n");
        df.show(5, 50);
        df.printSchema();

        System.out.println("\n --- Data Set 2 --- \n");
        df2.show(5, 50);
        df2.printSchema();
    }
}
