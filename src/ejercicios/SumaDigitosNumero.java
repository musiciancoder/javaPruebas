package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumaDigitosNumero {

    public static void main(String[] args) {
        int num = 1397;
        String str = String.valueOf(num);
       String[] arrStr= str.split("");
        List<String>listStr=new ArrayList<>();
        listStr = Arrays.asList(arrStr);
        System.out.println("Sumas parciales de los digitos");
        List<Integer>listInt = listStr.stream()
                .map(Integer::parseInt)//paso a integer
                .reduce((a,b)->{ //sumas parciales de los digitos
           int c= a+b;
            System.out.println(c);
            return c;
        }).stream().toList();
        System.out.println(" ");
        System.out.println("Sumas independientes de los digitos");




    }
}
