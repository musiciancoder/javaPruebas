package solid.liskovprinciple;

/*
According to LSP subtypes must be substitutable for supertype. The main concept behind LSP SOLID design principle is that derived class or subclass must enhance functionality not reduce.
Notar que al realizar polimorfismo no siempre el principio de Liskov se cumple, como en este caso, por ejemplo
 */

public class mispruebas {

    public static void main(String[] args) {


        //Integer[] es sub-tipo de Object[]


        Object [] objectsPolimorfismOut;

        Object[] objectsPolimorfismIn;

        objectsPolimorfismOut = new Object[]{4,5,6};

        objectsPolimorfismIn = new Integer []{4,5,6};

        objectsPolimorfismOut[0]=8;


        Object myObject;
        myObject = "object";
        objectsPolimorfismIn[0]=myObject; //fails to store an element of superclass as if an element of the subclass

        System.out.println("Polimorphism in: "+objectsPolimorfismOut[0]);
        System.out.println("Polimorphism out: "+ objectsPolimorfismIn); //fail






    }


}
