package mystreams;

import java.util.stream.*;

public class MyStreamOf {
    // Java code to print the elements of Stream
    // without using double colon operator

    public static void main(String[] args) {

        // Get the stream
        System.out.println("No double colon ::");
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");
        // Print the stream
        stream.forEach(s -> System.out.println(s));


        System.out.println("Using double colon ::");
        // Get the stream
        Stream<String> streamTwo
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
        // using double colon operator
        streamTwo.forEach(System.out::println);
    }
}


