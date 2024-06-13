package scannerbufferreader.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTestBuffer {

    public static void main(String args[])
            throws IOException
    {

        // Creating object of class inside main() method
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));



        // Taking integer input
        int a = br.read();
        int b = br.read(); //notar q el read() es solo para integer



        String c = br.readLine(); //No exister read() para String

        // Printing input entities above
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


