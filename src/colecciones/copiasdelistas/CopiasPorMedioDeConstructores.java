package colecciones.copiasdelistas;

import java.util.ArrayList;
import java.util.List;

public class CopiasPorMedioDeConstructores { //ESTO ES LO RECOMENDADO EN UN CODE CHALLENGE!!!

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(69);
        integerList.add(84);
        List<Integer> copyOfIntegerList = new ArrayList<>(integerList); //crea un shallow copy
        System.out.println(copyOfIntegerList); //[69, 84]
        integerList.add(45);
        System.out.println(copyOfIntegerList); //[69, 84]
        System.out.println(integerList); //[69, 84, 45]
        copyOfIntegerList.add(100);
        System.out.println(copyOfIntegerList); //[69, 84, 100]
        if (integerList==copyOfIntegerList){
            System.out.println("Ambos objetos son iguales"); //-->las listas no son iguales
        }
        if (integerList.get(0)==copyOfIntegerList.get(0)){
            System.out.println("Los contenidos de ambas listas hacen referencia a los mismos objetos en memoria");
        }
    }
}
