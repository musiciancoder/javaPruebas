package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class RestarElementosDeUnaLista {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(350);
        List<Integer> integerList2 = new ArrayList<Integer>();
        for (int i = 0; i < integerList.size() ; i++) {
            if(i<(integerList.size()-1)) {
                int a = integerList.get(i);
                int b = integerList.get(i + 1);
                int c = Math.abs(a-b);
                integerList2.add(c);
            }
        }
        integerList2.forEach(System.out::println);
    }
}
