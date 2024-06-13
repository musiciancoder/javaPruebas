package mystreams;

import java.util.List;
import java.util.Optional;

public class MyReducer2 {

    public static void main(String[] args) {

       // Reduce es una operacion terminal!!

        var list = List.of(2,10,5);

        //Primera sintaxis
        var value = list.stream().reduce(0,(a, b)->a+b); //acá no se imprimen valores intermedios. Ojo que sin el identity (valor por defecto) devuelve un optional en cambio con el identity devuelve un Integer
        System.out.println(value); // si no se usa identity en la linea de arriba debemos escribir         System.out.println(value.get);
        System.out.println("-----------------");

        //Segunda sintaxis
        var value2 = list.stream() //ojo, que value2 es un Optional de integer
                .reduce((a,b)->{ // aca sí se imprimen valores intermedios. En general con {} podemos escribir varias lineas de codigo
                   int c= (a+b);
                    System.out.println(c);//imprime varoles intermedios
                    int d=(c+ b);
                    return c;
                });

        System.out.println(value2.get());
    }
}
