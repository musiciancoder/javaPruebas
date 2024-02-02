package ejercicios;

import java.io.*;
import java.util.*;

public class ScannerBasico {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n=0;
        while (scan.hasNext()) {
            n++;
            System.out.println(n + " " + scan.nextLine());
        }
        //Close the scanner
        scan.close();

    }
}