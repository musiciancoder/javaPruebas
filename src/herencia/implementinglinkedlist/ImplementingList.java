package herencia.implementinglinkedlist;

import java.util.LinkedList;
import java.util.List;

public class ImplementingList {

    public static void main(String[] args) {

        //con ctrl+shift+space despues de new muestra todas las interfaces y clases
        List<String>listaLinked = new LinkedList<>();
        listaLinked.add("Andres");
        listaLinked.add("Claudio");
        listaLinked.add("Edgardo");
       // listaLinked.offer("Im offer"); //no se puede porque implementa a List y esta interface no tiene el método offer!!
    }
}
