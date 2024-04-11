package mybitset;

import java.util.BitSet;
import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        BitSet b1 = new BitSet(n);
/*        int c =0;
        while (c<n){
            b1.set(1,0,true);
            b1.set(2,0,true);
            b1.set(3,0,true);
            b1.set(0,true);
            b1.set(0,true);
            c++;
            System.out.println(b1);
        }*/
        BitSet b2 = new BitSet(n);
        int m = scan.nextInt();

        for (int i=0; i<m; i++) {
            String opr = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println("Nuevos valores");
            System.out.println(b1);
            System.out.println(b2);

            if (opr.equalsIgnoreCase("AND")) {
                if (x == 1 && y == 2) b1.and(b2);
                if (x == 2 && y == 1) b2.and(b1);
            } else if (opr.equalsIgnoreCase("OR")) {
                if (x == 1 && y == 2) b1.or(b2);
                if (x == 2 && y == 1) b2.or(b1);
            } else if (opr.equalsIgnoreCase("XOR")) {
                if (x == 1 && y == 2) b1.xor(b2);
                if (x == 2 && y == 1) b2.xor(b1);
            } else if (opr.equalsIgnoreCase("FLIP")) {
                if (x == 1) b1.flip(y);
                if (x == 2) b2.flip(y);
            } else if (opr.equalsIgnoreCase("SET")) {
                if (x == 1) b1.set(y);
                if (x == 2) b2.set(y);
            } else {
                System.out.println("Invalid operation entered!");
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scan.close();
    }


}