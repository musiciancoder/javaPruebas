package arrays;

import java.util.Arrays;

public class cadenasyarreglos {

    public static void main(String[] args) {

        String str1= "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
       //De string a array
        String [] arr1 = str1.split(" ");
        for (String p: arr1) {
            System.out.print(p);
            System.out.print(" ");
        }

//de array  string
        System.out.println(" ----------------------------SEPARATOR ");
        String str2= Arrays.toString(arr1).replace(",", "");
        System.out.println(str2);



    }
}
