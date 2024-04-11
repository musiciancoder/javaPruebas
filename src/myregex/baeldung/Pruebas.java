package myregex.baeldung;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class Pruebas {

    @Test
    public void givenText_whenSimpleRegexMatchesTwice_thenCorrect() {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foofoo");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }

        assertEquals(matches, 2);
    }

    public static int runTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    @Test
    public void givenText_whenMatchesWithDotMetach_thenCorrect() {
        int matches = runTest(".", "foo"); //   . = any character

        assertTrue(matches > 0);
    }

    @Test
    public void givenRepeatedText_whenMatchesOnceWithDotMetach_thenCorrect() {
        int matches= runTest("foo.", "foofoo"); // foo. = any character after foo

        assertEquals(matches, 1);
    }

    @Test
    public void givenORSet_whenMatchesAny_thenCorrect() {
        int matches = runTest("[abc]", "b");

        assertEquals(matches, 1);
    }

    @Test
    public void givenORSet_whenMatchesAnyAndAll_thenCorrect() {
        int matches = runTest("[abc]", "cab"); //al regex no le importa el orden

        assertEquals(matches, 3);
    }

    @Test
    public void givenORSet_whenMatchesAllCombinations_thenCorrect() {
        int matches = runTest("[bcr]at", "bat cat rat mat"); //bat cat o rat

        assertEquals(matches, 3);
    }

    @Test
    public void givenNORSet_whenMatchesNon_thenCorrect() {
        int matches = runTest("[^abc]", "gato"); //gato no contiene a ni b ni c

        assertTrue(matches > 0);
    }

    @Test
    public void givenNORSet_whenMatchesAllExceptElements_thenCorrect() {
        int matches = runTest("[^bcr]at", "sat mat eat"); //el texto no contiene bat ni cat ni rat

        assertTrue(matches > 0);
    }

    @Test
    public void givenBothLowerAndUpperCaseRange_whenMatchesAllLetters_thenCorrect() {
        int matches = runTest(
                "[a-zA-Z]", "Two Uppercase alphabets 34 overall");

        assertEquals(matches, 28);
    }

    @Test
    public void givenNumberRange_whenMatchesAccurately_thenCorrect() {
        int matches = runTest(
                "[1-5]", "Two Uppercase alphabets 34 overall");

        assertEquals(matches, 2);
    }

    @Test
    public void givenNumberRange_whenMatchesAccurately_thenCorrect2(){
        int matches = runTest(
                "3[0-5]", "Two Uppercase alphabets 34 overall");

        assertEquals(matches, 1);
    }

    @Test
    public void givenTwoSets_whenMatchesUnion_thenCorrect() {
        int matches = runTest("[1-3[7-9]]", "6"); //del 1 al 3 ó del 7 al 9

        assertEquals(matches, 6);
    }

    @Test
    public void givenTwoSets_whenMatchesIntersection_thenCorrect() {
        int matches = runTest("[1-6&&[3-9]]", "123456789"); //del 1 al 6 y del 3 al 9

        assertEquals(matches, 4);
    }

    @Test
    public void givenSetWithSubtraction_whenMatchesAccurately_thenCorrect() {
        int matches = runTest("[0-9&&[^2468]]", "123456789"); //del 0 al 9 menos pares

        assertEquals(matches, 5);
    }

    @Test
    public void givenDigits_whenMatches_thenCorrect() {
        int matches = runTest("\\d", "123"); //q contenga digitos

        assertEquals(matches, 3);
    }

    @Test
    public void givenNonDigits_whenMatches_thenCorrect() {
        int matches = runTest("\\D", "a6c"); ////q contenga no digitos

        assertEquals(matches, 2);
    }

    @Test
    public void givenWhiteSpace_whenMatches_thenCorrect() {
        int matches = runTest("\\s", "a c"); //q contenga espacio en blanco

        assertEquals(matches, 1);
    }

    @Test
    public void givenNonWhiteSpace_whenMatches_thenCorrect() {
        int matches = runTest("\\S", "a c"); //que NO ontenga espacio en blanco

        assertEquals(matches, 2);
    }

   // Matching a word character, equivalent to [a-zA-Z_0-9]:

    @Test
    public void givenWordCharacter_whenMatches_thenCorrect() {
        int matches = runTest("\\w", "hi!");

        assertEquals(matches, 2);
    }

  //  Matching a non-word character:

    @Test
    public void givenNonWordCharacter_whenMatches_thenCorrect() {
        int matches = runTest("\\W", "hi!"); //Que tenga un no-caracter. EL ! es un no-caracter

        assertEquals(matches, 1);
    }

  //  To match a text zero or one time, we use the ? quantifier:

    @Test
    public void givenZeroOrOneQuantifier_whenMatches_thenCorrect() {
        int matches = runTest("\\a?", "hi");

        assertEquals(matches, 3);
    }

  //  Alternatively, we can use the brace syntax, which is also supported by the Java regex API:

    @Test
    public void givenZeroOrOneQuantifier_whenMatches_thenCorrect2() {
        int matches = runTest("\\a{0,1}", "hi");

        assertEquals(matches, 3);
    }

    @Test
    public void givenBraceQuantifier_whenMatches_thenCorrect() {
        int matches = runTest("a{3}", "aaaaaa");

        assertEquals(matches, 2);
    }

    @Test
    public void givenBraceQuantifierWithRange_whenMatches_thenCorrect() {
        int matches = runTest("a{2,3}", "aaaa");

        assertEquals(matches, 1);
    }
}
