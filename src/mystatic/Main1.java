package mystatic;

public class Main1 {

    public static void main(String[] args) {

        Auto auto1 = new Auto("XDF45","Suzuki", 236,"azul");
        Auto auto2 = new Auto("HFH78","BMW", 400,"rojo");

        Auto auto3 = new Auto("BR56H4","Toyota", 600,"verde");

        System.out.println(auto1.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());

   //     auto1.anularDescuento();
        Auto.anularDescuento();

        System.out.println("");
        System.out.println(auto1.precioPromocional());
        System.out.println(auto2.precioPromocional());
        System.out.println(auto3.precioPromocional());





    }

}

