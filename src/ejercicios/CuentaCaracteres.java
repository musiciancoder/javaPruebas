package ejercicios;

import java.util.Scanner;

public class CuentaCaracteres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String character = scan.next();
        int lengthOfText= text.length();
        StringBuilder builder = new StringBuilder(text);
        char mychar = character.charAt(0);
        int counter=0;
        for (int i = 0; i < lengthOfText ; i++) {
            if (builder.charAt(i)==mychar){
            counter++;
            }
        }
        System.out.println(counter);
    }
}
