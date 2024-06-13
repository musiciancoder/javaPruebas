package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnionAndIntersection {
    public static void main(String[] args) {
        //UNION
        Pattern pattern = Pattern.compile("\\bm[a-z][a-z]f\\b");
        Matcher matcher = pattern.matcher("milf");
        if (matcher.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //INTERSECTION
       // Pattern pattern2 = Pattern.compile("\\bm[aeiou&&[a-z]el\\b");
          Pattern pattern2 = Pattern.compile("\\bm[aeiou&&[a-z]]el\\b"); //la letra a,e,i,o,u (en nuestro caso i) debe ir seguida de letra de la a la z (en nuestro caso e). Ojo, que la e debe ir puesta al final de la interseccion, sino falla
        Matcher matcher2 = pattern2.matcher("miel");
        if (matcher2.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");
    }
}
