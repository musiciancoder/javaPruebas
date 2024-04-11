package mybiginteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        //pasar de integer a BigInteger
        //    int i = 24567;
        //    BigInteger c = new BigInteger(String.valueOf(i));

        BigInteger b = new BigInteger(n);

        System.out.println(b.isProbablePrime(10)?"prime":"not prime");
    }
}
