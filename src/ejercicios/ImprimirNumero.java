package ejercicios;

import java.util.Scanner;

public class ImprimirNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.next();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numero.length(); i++) {
         builder = builder.append(numero.charAt(i));
            System.out.println(builder);
        }
    }
}
