# Few examples of how to parse different kinds of files.

Creating a spark session and using it to read the format of a CSFB file or json file.
We create a data set with rows which is known as a data frame and that is going to have the variable 'df' to represent data.

Examples
1)  We're not specifically giving any kind of names to these fields, these are coming raw from the file and we're leaving it up to spark to figure out what data type these columns should be.
2)  We're specifically giving names to these fields & using SparkSession it allows us to define our own data types.
3)  Instead of CSB file, we are now using json, a simple json file and a multi-line json file.    
