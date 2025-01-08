package ejercicios;

import java.util.Scanner;
import java.util.Stack;

/*
System.out.println(isValidParentheses("()")); // true System.out.println(isValidParentheses("()()")); // true System.out.println(isValidParentheses("(())")); // true System.out.println(isValidParentheses("(()")); // false System.out.println(isValidParentheses(")("
 */


public class BalancedParenthesesWithStack {

    public static boolean isValidParentheses(String s){
        char [] charArr = s.toCharArray();
        Stack <String>stack = new Stack();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i]=='('){
                stack.push(String.valueOf(charArr[i]));
            } else if (charArr[i]==')' && (!stack.isEmpty())){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println( isValidParentheses(s) );

    }
}
