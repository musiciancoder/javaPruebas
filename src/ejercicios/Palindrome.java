package ejercicios;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {



    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    StringBuilder builder = new StringBuilder(A);
    boolean bandera;
    int k = builder.length()-1;

        for(int i = 0; i < builder.length(); i++) {

        if(!(builder.charAt(i)==builder.charAt(k))){
            System.out.println("No");
            return;
        } else {
            bandera = true;
        }
            k--;
        }
if (bandera=true){
    System.out.println("Yes");
}

}

}

