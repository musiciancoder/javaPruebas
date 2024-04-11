package encryption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.security.MessageDigest;


public class MD5Algorithm {
    public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String output = "";
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input.getBytes());
            for (byte b:digest
                 ) {
                System.out.println(b);
            }
            BigInteger bigInteger = new BigInteger(1,digest);

            String hash = bigInteger.toString(16);
            while(hash.length() < 32){
                hash += "0" + hash;
            }

            output = hash;
            System.out.println(output);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    }

