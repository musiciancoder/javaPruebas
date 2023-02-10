package solid.liskovprinciple;

/*

Notar que al realizar polimorfismo no siempre el principio de Liskov se cumple, como en este caso, por ejemplo
 */

public class mispruebas {

    public static void main(String[] args) {
        Integer[] array = { 1,2,3 };
        Object[] arrayObjects = array;

        //Integer[] es sub-tipo de Object[]
        //¿es seguro?

      //  arrayObjects[0] = "Hola"; //falla, por lo que no se cumple Liskov
        arrayObjects[0] = 0; //no falla
        System.out.println(arrayObjects[0]);

        Object [] objectsSinPolimorfismo;

        Object[] objectsConPolimorfismo;

        objectsSinPolimorfismo = new Object[]{4,5,6};

        objectsConPolimorfismo = new Integer []{4,5,6};

        objectsSinPolimorfismo[0] = "str";

  //      objectsConPolimorgismo[0] = "str"; falla

        System.out.println(objectsSinPolimorfismo[0]);
   //     System.out.println(objectsConPolimorgismo[0]); falla






    }


}
