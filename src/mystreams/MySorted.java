package mystreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySorted {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");

        // displaying the stream with elements
        // sorted in natural order
        list.stream().sorted().forEach(System.out::println);

        System.out.println(" ");

        // Creating a list of strings
        List<String> list2 = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks", "GFG");

        System.out.println("The sorted stream is : ");

        // displaying the stream with elements
        // sorted in their natural order
        list2.stream().sorted().forEach(System.out::println);

        System.out.println(" ");

        class Point
        {
            Integer x, y;
            Point(Integer x, Integer y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return this.x + ", "+ this.y;
            }
        }

        class GFG
        {
            public static void main(String[] args)
            {

                List<Point> aList = new ArrayList<>();
                aList.add(new Point(10, 20));
                aList.add(new Point(5, 10));
                aList.add(new Point(1, 100));
                aList.add(new Point(50, 2000));

                // displaying the stream with elements
                // sorted according to x coordinate
                aList.stream()
                        .sorted((p1, p2)->p1.x.compareTo(p2.x))
                        .forEach(System.out::println);
            }
        }
    }
}
