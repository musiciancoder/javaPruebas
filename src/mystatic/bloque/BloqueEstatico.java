package mystatic.bloque;

import java.util.Scanner;

public class BloqueEstatico {


    static {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive"); //al ponerlo fuera del thread main nos ahorramos el "Exception in thread main", que era lo q padia el ejercicio
            } else {
                System.out.println(B * H);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("Main");

    }
}
