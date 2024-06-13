package colecciones.mymap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashsetYSusMetodos {

    public static void main(String[] args) {
        HashMap<String,String> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put("Fender","Stratocaster");
        integerIntegerMap.put("Gibson","SG");

        for ( Map.Entry<String, String> entry : integerIntegerMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: ".concat(key).concat(", Value: ").concat(value));
        }
    }
}
