package myregex;



    // Java program to demonstrate difference
// between Possessive and Greedy Quantifiers

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    class PossessiveQuantifiers
    {
        public static void main(String[] args)
        {
            // Create a pattern with Greedy quantifier
            Pattern pg = Pattern.compile("g+g");

            // Create same pattern with possessive quantifier
            Pattern pp = Pattern.compile("g++g");

            System.out.println("Using Greedy Quantifier");
            Matcher mg = pg.matcher("ggg");
            while (mg.find())
                System.out.println("Pattern found from " + mg.start() +
                        " to " + (mg.end()-1));

            System.out.println("\nUsing Possessive Quantifier");
            Matcher mp = pp.matcher("ggg");
            while (mp.find())
                System.out.println("Pattern found from " + mp.start() +
                        " to " + (mp.end()-1));

        }
    }
