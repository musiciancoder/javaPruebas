package ejercicios;

import java.util.Scanner;

public class MyString1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();


        int la = a.length();
        int lb = b.length();

        System.out.println(la + lb);

        if (a.compareTo(b) > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        StringBuilder builderA = new StringBuilder(a);
        StringBuilder builderB = new StringBuilder(b);

       char ca =  builderA.charAt(0);
       String sa = String.valueOf(ca);
       char cb =  builderB.charAt(0);
        String sb = String.valueOf(cb);

builderA.replace(0,1, sa.toUpperCase() );
builderB.replace(0,1, sb.toUpperCase() );
        StringBuilder builderC = builderA.append(" ").append(builderB);
        System.out.println(builderC);


    }
}
