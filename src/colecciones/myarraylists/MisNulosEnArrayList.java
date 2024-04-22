package colecciones.myarraylists;

import java.util.ArrayList;

public class MisNulosEnArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add(0,"naranja");
      //  frutas.add(2,"pera"); ////indexOutOfBoundsException, porque falta agregar el indice1
        System.out.println("frutas: " + frutas); //indexOutOfBoundsException
        frutas.add(1,null); //acepta nulos siempre y cuando seamos nosotros quienes se los setiemos
        System.out.println("frutas: " + frutas); //frutas: [naranja, null]

    }
}
