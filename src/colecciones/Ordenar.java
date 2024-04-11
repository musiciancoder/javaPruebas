package colecciones;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ordenar {
    /*
    Ordenar
    9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
     */

    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        /*
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        Error .Comparable.compareTo(Object)" because "pivot" is null --> notar que cuando cambiamos a  String[] s = new String[n]; el error desaparece (hackerrank pone a proposit esto para que tengamos q ocupar BigInteger. Yo ocupé Double e igual funciona.
         */
        Comparator<String>myCustomComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) { //implementamos compare para poder ordenar los null que vienen de n+2 en  String[] s = new String[n+2]; que no se podía cambiar en hackerrank
                Double a =Double.valueOf(s1);
                Double b =Double.valueOf(s2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s,0,n,myCustomComparator);
        System.out.println(Arrays.toString(s));
    }

}
