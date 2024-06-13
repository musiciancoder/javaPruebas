package myregex;

//The subexpression/metacharacter “.” matches any single character except a newline.

import java.util.regex.Matcher;
        import java.util.regex.Pattern;
public class ContarCaracteresUsandoElRegexPunto {
    public static void main( String args[] ) {
        String regex = ".";
        String input = "Hi how are you welcome to Tutorialspoint";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        int count = 0;
        while(m.find()) {
            count++;
        }
        System.out.println("Number of matches: "+count);
    }
}