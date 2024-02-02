package bigdecimal;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class PruebaConScanner {




        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);

            BigInteger bi1= scan.nextBigInteger();
            BigInteger bi2= scan.nextBigInteger();
            BigInteger bi3= bi1.add(bi2);
            BigInteger bi4= bi1.multiply(bi2);
            System.out.println(bi3);
            System.out.println(bi4);

    }
}
