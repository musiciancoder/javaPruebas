package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rgex1 {


    // Find out if there are any occurrences of the word "w3schools" in a sentence:

    public static void main(String[] args) {
       // Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
       // Matcher matcher = pattern.matcher("Visit W3Schools!");
        Pattern pattern = Pattern.compile("([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)");
        Matcher matcher = pattern.matcher("45.34.255.000");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
// Outputs Match found


/*

Regular Expression Patterns
The first parameter of the Pattern.compile() method is the pattern. It describes what is being searched for.

Brackets are used to find a range of characters:

Expression	Description
[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9
Metacharacters
Metacharacters are characters with a special meaning:

Metacharacter	Description
|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character
\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b

Quantifiers
Quantifiers define quantities:

Quantifier	Description
n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's


 */

