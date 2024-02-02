package ejercicios;

import java.util.Scanner;

public class MinimoComunMultiplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = Integer.parseInt(scanner.nextLine());  // Read user input
        System.out.println("First number: " + firstNumber);  // Output user input
        System.out.println("Enter second number");
        int secondNumber = Integer.parseInt(scanner.nextLine());  // Read user input
        System.out.println("Second number: " + secondNumber);  // Output user input

        int i=2;
        int numero = 2;
        boolean mcm = false;

        if(firstNumber%i==0 && secondNumber%i==0){
            System.out.println("El MCM es: " + firstNumber);
            return;
        } else {

            do {
                int num1 = numero;
                if (firstNumber % i == 0 || secondNumber % i == 0) {
                    numero = i;
                    i++;
                }
                int num2 = numero;
                if (num1 != num2) {
                    mcm = true;
                }

            } while (mcm = false);

            System.out.println("El MCM es: " + firstNumber * secondNumber);
        }

    }
}
