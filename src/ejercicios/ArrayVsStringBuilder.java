package ejercicios;

import java.util.Arrays;

public class ArrayVsStringBuilder {

    public static void main(String[] args) {
        //Solo array de strings, sin char
        String str = "palabra";
        String [] array = new String[str.length()];
        String [] array2 = new String[str.length()];
        array= str.split("");
        int c = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            array2[i] = array[c];
            c --;
        }
        System.out.println(Arrays.toString(array2));
        for (String p:
             array2) {
            System.out.print(p);
        }

        System.out.println();

        //solo stringbuilder, con char
        StringBuilder builder = new StringBuilder();
         for (int i = str.length() -1; i >=0 ; i--) {
            builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
    }

}
