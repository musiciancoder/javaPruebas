package ejercicios;

import java.util.*;
import java.util.stream.Collectors;

public class CompararValoresDeUnMapa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String k = scanner.next();
            int v = scanner.nextInt();
            map.put(k, v);
        }
/*      map= (Map<String, Integer>) map.entrySet().stream().map(Map.Entry::getValue).sorted(); //no se puede hacer este casting
        System.out.println(map);*/
        List<Integer> listOfValues = new ArrayList<>();
        listOfValues = map.entrySet().stream().map(Map.Entry::getValue).sorted().collect(Collectors.toList());
        Map<String, Integer> sortedMap = new LinkedHashMap<>(); //tiene q ser un LinkedHashMap para que respete el orden de entrada de los elementos, con Hsshmap los devuelve desordenados.
        for (Integer val : listOfValues) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (val.equals(value)) {
                    sortedMap.put(key, val);
                }
            }


        }
        System.out.println(sortedMap);
    }

}
