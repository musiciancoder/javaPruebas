package colecciones.mylinkedlists;

import java.util.ArrayList;
import java.util.LinkedList;

public class MisNulosEnLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>();
        frutas.add(0,"naranja");
        //  frutas.add(2,"pera"); ////indexOutOfBoundsException, porque falta agregar el indice1
        System.out.println("frutas: " + frutas); //indexOutOfBoundsException
        frutas.add(1,null); //acepta nulos siempre y cuando seamos nosotros quienes se los setiemos
        System.out.println("frutas: " + frutas); //frutas: [naranja, null]
    }
}
