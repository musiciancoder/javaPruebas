package ejercicios;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MyConditional {

    public static <BufferedReader> void main(String[] args) throws Exception {
     //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

   //     int N = Integer.parseInt(bufferedReader.readLine().trim());

     //   bufferedReader.close();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        scan.close();

        if(N<1 || N>100){
            throw new Exception ("Please enter number between 1 and 100");
        }

        if (N%2!=0){
            System.out.println("Weird");
        }
        if (N<=5 && N>=2 && N%2==0 ){
            System.out.println("Not Weird");
        }
        if (N<=20 && N>=6 && N%2==0 ){
            System.out.println("Weird");
        }
        if (N>20 && N%2==0 ){
            System.out.println("Not Weird");
        }
    }
}
