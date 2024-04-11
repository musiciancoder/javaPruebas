package encryption;

import java.io.*;
import java.util.*;
import java.security.*;

public class SHA256Algorithm {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);//enter HelloWorld
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();

        m.update(input.nextLine().getBytes());
        for(byte i:m.digest()){
            System.out.print(String.format("%02x",i));
        }
        System.out.println();
        //enter HelloWorld (again) to obtain bytes
        byte [] mybytes = input.nextLine().getBytes();
        for (byte i: mybytes) {
            System.out.println(i);}
    }

}