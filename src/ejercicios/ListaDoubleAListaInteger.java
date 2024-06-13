package ejercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ListaDoubleAListaInteger {
    public static void main(String[] args) {

        List<Double> listDouble = new ArrayList<>();
        listDouble.add(4.306);
        listDouble.add(4.00);
        listDouble.add(4.895);


        List<Integer>listInteger= listDouble.stream().map(dou->{
            BigDecimal bd= new BigDecimal(dou);
            Integer integer = bd.intValue();
           bd = bd.subtract(BigDecimal.valueOf(integer));
            if (bd.compareTo(new BigDecimal(String.valueOf(0.0)))>0.8){
               return integer;
            } else {
                return integer + 1 ;
            }
        }).toList();

        System.out.println(listInteger);

    }

}
