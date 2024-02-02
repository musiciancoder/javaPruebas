package ejercicios;

import java.util.Arrays;

public class Kaprekar {

    public static void main(String[] args) {

        Integer number;

        for (int i = 1; i < 1000; i++) {
            number = i*i;
            Integer integer= number.toString().length();
            String str = String.valueOf(integer);
            StringBuilder mystrb= new StringBuilder(str);
            StringBuilder strb= new StringBuilder(" ");


            System.out.println(String.valueOf(i) + " " + String.valueOf(number) + " " + str);

            }



        }
    }

