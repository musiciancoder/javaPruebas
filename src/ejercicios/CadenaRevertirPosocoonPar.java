package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CadenaRevertirPosocoonPar {

    public static void main(String[] args) {
        String str = "hola mundo soy Andres";
        List <String> list =Arrays.asList(str.split(" "));
        for (int i = 0; i < list.size(); i++) {
            if (i==0 || i%2==0){
                String s = list.get(i);
                StringBuilder builder = new StringBuilder (s);
                  builder.reverse();
                list.set(i, builder.toString());
            }
        }
        str = String.join(" ", list);
        System.out.println(str);
    }
}
