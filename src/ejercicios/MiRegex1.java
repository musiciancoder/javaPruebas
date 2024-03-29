package ejercicios;

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[A-Za-z][a-zA-Z0-9_]{7,29}";
  //  "^[A-Za-z]{1}[a-zA-Z0-9_]{6,28}" esto falla en algunos casos
}

class MiRegex1 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
