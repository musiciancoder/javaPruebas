package ejercicios;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            Scanner scan2 = new Scanner(System.in);
            int a = scan2.nextInt();
            int b = scan2.nextInt();
            int n = scan2.nextInt();

            int p = 0;
            int anterior=a;
            int result=0;
            for (int j = 0; j < n; j++) {
                result = (int) (Math.pow(2, j) * b);
                p = result + anterior;
                System.out.print(p + " ");
                anterior =p;
            }
            System.out.println();
        }
        scan.close();
    }

}
