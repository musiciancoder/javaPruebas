package ejercicios.barathcurso;

import java.util.Scanner;

public class TarjetasSegunSueldo {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            int salary = Integer.parseInt(scanner.nextLine());
            switch (salary) {
                case 1000:
                System.out.println("User Does not qualify for credit card");
                case 2000:
                    System.out.println("User  qualify for silver card");
                case 3000:
                    System.out.println("User  qualify for gold card");
                case 4000:
                    System.out.println("User  qualify for silver card");
            }
            }
        }

    }

