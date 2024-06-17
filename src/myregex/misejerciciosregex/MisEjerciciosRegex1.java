package myregex.misejerciciosregex;

import java.util.*;

public class MisEjerciciosRegex1 {

    //Si una palabra contiene dos erres seguidas y la palabra siguiente termina en n,s o vocal, cambiar la palabra siguiente por la subsiguiente

    public static void main(String[] args) {
        String str = "El arrabal era muy grande y el arrabio muy corto ";
        List <String> stringList = new ArrayList<>(Arrays.asList(str.split(" ")));
        HashMap<Integer,Integer>integerIntegerMap = new HashMap<>();
        for (int i = 0; i < stringList.size() ; i++) {
            if ((i + 1) != stringList.size()) {


                if ((stringList.get(i).contains("rr") && stringList.get(i + 1).endsWith("a")) || (stringList.get(i).contains("rr") && stringList.get(i + 1).endsWith("e")) || (stringList.get(i).contains("rr") && stringList.get(i + 1).endsWith("i")) || (stringList.get(i).contains("rr") && stringList.get(i + 1).endsWith("o")) || (stringList.get(i).contains("rr") && stringList.get(i + 1).endsWith("u"))) {
                    integerIntegerMap.put(i, i + 1);
                }
            }
        }

            for ( Map.Entry<Integer, Integer> entry : integerIntegerMap.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
              Collections.swap(stringList, key, value);
            }
            


    }
}
