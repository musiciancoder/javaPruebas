package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyTryCatch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x=0;
        int y=0;
        try {
            x = scan.nextInt();
            y = scan.nextInt();
            int z= x/y;
            System.out.println(z);


        } catch (InputMismatchException e) {
           // e.printStackTrace(); //imprime en rojo
            //throw new InputMismatchException("java.util.InputMismatchException");
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


/*       try {
            int z= x/y;
            System.out.println(z);
        } catch (InputMismatchException e) {
        //    e.printStackTrace();
        }*/


    }
}
