package equalsvsigual;

public class Ejemplo {



    public static void main(String[] args) {

        //Memory reference is the same as memory location, is the physical location whithin the  memoyy
        String s1 = "chocolate"; //points to memory reference X
        String s2 = "caramelo"; //points to memory reference Y
        s2= "chocolate"; //now due to the fact that Strings are immutable, s2 points to the  memory reference X

        if ((s2 == s1)) { //==compares memory reference only
            System.out.println("s2 == s1");
        } else {
            System.out.println("s2 != s1");
        }
        if (s2.equals(s1)){ //compares values only
            System.out.println("equals");
        } else {
        System.out.println("not equals");
       }
        String s3 = new String("chocolate");//by using new keyword we are creating a new object in a diferent memory reference Z
        if ((s3 == s1)) { //==compares memory reference only
            System.out.println("s3 == s1");
        } else {
            System.out.println("s3 != s1");
        }
        if ((s3.equals(s1))) { //compares values only
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }
}
