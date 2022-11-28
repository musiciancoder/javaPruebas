package inmutabilidad;

public class CadenasInmutables {

    public static void main(String[] args) {

        //A class is immutable if we have two references targeting different objects of that class and when one of them swaps to the same atributes of the second, they both start targeting the same object in memory

        //Each time we use String x, String y, etc we use String pool, meaning two different references (x and y) sharing the same object
        //Both references x and y target different objects in memory from the beginning

        String x = "first value";
        String y = "second value";
        System.out.println("Before swapping:");
        System.out.println("x: " + x + " ; y: " + y);
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode y: " + y.hashCode()); //x and y targeting diferent object in memory

        System.out.println("");

        x = "second value";
        System.out.println("After swapping:");
        System.out.println("x: " + x + " ; y: " + y);
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode y: " + y.hashCode());//x and y targeting the same object in memory

        System.out.println("");

        x = "second value";
        System.out.println("After swapping:");
        System.out.println("x: " + x + " ; y: " + y);
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode y: " + y.hashCode());//x targeting a different object in memory, however y targets its original value

        System.out.println("");

        //When we use "new"  we are not using string pool, which means we are not sharing objects when two references (x and z) have the same value ("first value").
        //However when we create two strings with operator new and same value, they do have same hashcode, eventhough we are out of the string pool in both cases
        String z = new String("first value");
        String w= new String("first value");
        System.out.println("hashcode x: " + x.hashCode() + " ; hashcode z: " + z.hashCode() + " ; hashcode w: " +w.hashCode());
    }
}
