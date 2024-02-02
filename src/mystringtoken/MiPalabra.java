package mystringtoken;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MiPalabra {
    public static void main(String[] args) {



            String s = "He is a very very good boy, isn't he?";

            StringTokenizer st = new StringTokenizer(s, " !,?._'@+"); //notar que en el delimitador hay un espacio vacio!! Este puede ir o no.

            System.out.println(st.countTokens());
            while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        }
}
