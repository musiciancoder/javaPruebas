package scannerbufferreader.bufferreader;

// Java Program to Illustrate BufferedReader Class

/*
Outputs explanation: In Scanner class if we call nextLine() method after any one of the seven nextXXX() method then the nextLine() does not read values from console and cursor will not come into console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().

In BufferReader class there is no such type of problem. This problem occurs only for the Scanner class, due to nextXXX() methods ignoring newline character and nextLine() only reads till the first newline character. If we use one more call of nextLine() method between nextXXX() and nextLine(), then this problem will not occur because nextLine() will consume the newline character.
 */

// Importing required class
import java.io.*;

// Main class
class GFGBufferReader {

    // Main driver method
    public static void main(String args[])
            throws IOException
    {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        // Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");

        String b = br.readLine();

        // Printing input entities above
        System.out.printf("You have entered:- " + a
                + " and name as " + b);
    }
}

