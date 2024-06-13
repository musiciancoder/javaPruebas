package integer;

public class doubletoint {

    public static void main(String[] args) {

        double d = 1.767;
        int i = (int) d; //siempre aproxima hacia abajo
        System.out.println(i); // devuelve 1

        double e = 1.5976;
        int j = (int) Math.round(e); //siempre aproxima hacia donde debe (en este caso hacia arriba)
        System.out.println(j);

    }
}
