package ejercicios;

//1928
//Suma de las cifras: 10 11 10
//Resta de las cifras: 8 7 6
//Si la suma de las cifras > 150000 --> suma valida
//Si la resta de las cifras  < 3 -->resta valida
//Formar nuevo numero intercambiando suma valida y resta valida

import java.util.*;
import java.util.stream.Collectors;

public class ReducerNumerosMezclados {
    public static void main(String[] args) {
        int numero = 1928;
        String str = String.valueOf(numero);
        List<String>stringList= new ArrayList<>(Arrays.asList(str.split("")));
        List<Integer>integerList= new ArrayList<>();
        integerList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
        int resta = integerList.stream()
                .reduce(0,(a,b)->{
                    int c= Math.abs(a-b);
                    return c;
                });
        int suma = integerList.stream()
                .reduce(0,(a,b)->{
                    int c= a-b;
                    return c;
                });

        List<Integer> integerRestaList = new ArrayList<Integer>();
        for (int i = 0; i < integerList.size() ; i++) {
            if(i<(integerList.size()-1)) {
                int a = integerList.get(i);
                int b = integerList.get(i + 1);
                int c = Math.abs(a-b);
                integerRestaList.add(c);
            }
        }

        List<Integer> integerSumaList = new ArrayList<Integer>();
        for (int i = 0; i < integerList.size() ; i++) {
            if(i<(integerList.size()-1)) {
                int a = integerList.get(i);
                int b = integerList.get(i + 1);
                int c = a+b;
                integerSumaList.add(c);
            }
        }

        List<Integer> newList = new ArrayList<Integer>();

      int c = 0;
        while (c < integerRestaList.size()) {
            newList.add(integerRestaList.get(c));
            newList.add(integerSumaList.get(c));
            c++;
        }

        System.out.println(newList);


    }
}
