package ejercicios;

import java.util.Scanner;

public class TipodDeDatos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int i = 0;
        String[] arr = new String[q];
        while (i < q) {
            String str = scan.next();
            arr[i] = str;
            i++;
        }

        for (String l : arr) {

            try {
                long mylong = Long.parseLong(l);
                System.out.println(l + " can be fitted in: ");
                if (mylong <= 127 && mylong >= -128) {
                    System.out.println("* byte");
                }
                if (mylong <= 32767 && mylong >= -32768) { //            if(l< 127 && l >-128){
                    System.out.println("* short");
                }
                if (mylong <= 2147483647 && mylong >= -2147483648) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(l + " can't be fitted anywhere.");
            }


        }

    }
}



