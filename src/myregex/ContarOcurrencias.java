package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContarOcurrencias {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher("HelloxxxHelloxxxHello");

        long matches = matcher.results().count();

        System.out.println(matches); //java 9+

        //java8
        /*
        int count = 0;
while (matcher.find())
    count++;
         */
    }
}
