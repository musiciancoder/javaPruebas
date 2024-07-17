package ejercicios;

//Dado un mapa de decimales Si la parte entera del valor es mayor a la parte entera del valor del registro siguiente, la clave pasa a ser el valor

import java.math.BigDecimal;
import java.util.*;

public class MapaConBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<BigDecimal, BigDecimal> map = new LinkedHashMap<>();
        Map<BigDecimal, BigDecimal> mapTwo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            BigDecimal k = scanner.nextBigDecimal();
            BigDecimal v = scanner.nextBigDecimal();
            map.put(k, v);
        }
        Iterator<Map.Entry<BigDecimal, BigDecimal>> iterator = map.entrySet().iterator();
        int parteDecimalAnterior= 0;
        while (iterator.hasNext()) {
            Map.Entry<BigDecimal, BigDecimal> entry = iterator.next();
            BigDecimal key = entry.getKey();
            BigDecimal value = entry.getValue();
           int parteEntera = value.intValue();
           int parteDecimal= Integer.parseInt(value.subtract(new BigDecimal(parteEntera)).toPlainString().replace(".",""));

            //comparar
            if (parteDecimal>parteDecimalAnterior){
                mapTwo.put(value,key);
            } else {
                mapTwo.put(key,value);
            }
            //
            parteDecimalAnterior= parteDecimal;





        }
        System.out.println(mapTwo);
    }
}
