package dev.cosmingherghe.spark;

public class Application {

    public static void main(String[] args) {

        //First Example
        System.out.println("\n--- First Example ---\n");
        // We're not specifically giving any kind of names to these fields
        // these are coming raw from the file and we're leaving it up to spark to figure out
        // what the data types of these columns should be.
        InferCSVSchema parser1 = new InferCSVSchema();
        parser1.printSchema();


        //Second Example
        System.out.println("\n--- Second Example ---\n");
        // We're specifically giving names to these fields
        DefineCSVSchema parser2 = new DefineCSVSchema();
        parser2.printDefinedSchema();
    }
}
