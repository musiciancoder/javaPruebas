package mystatic;

public class Auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double descuento;

    //notar q en el argumento del constuctor no va la variable estatica, porque es comun a todos los elementos de la clase
    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.descuento = 5;
    }

    public double precioPromocional(){
        this.pruebaMetodoNoStatic();//En método no static se puede llamar otro metodo no static sin problemas con this
        this.pruebaMetodoStatic();////En método no static se puede llamar otro metodo static sin problemas con this
        Auto myAuto = new Auto("GDGFG4","Citroen", 237,"negro");
        myAuto.pruebaMetodoNoStatic();
        myAuto.pruebaMetodoStatic();
        return this.precio-this.precio*(Auto.descuento)/100;
    }

    public static void anularDescuento(){
        Auto.descuento=0;
       // this.pruebaMetodoNoStatic();//En método static NO se puede llamar otro metodo no static sin problemas con this
        //this.pruebaMetodoStatic();////En método static NO se puede llamar otro metodo static sin problemas con this
        Auto myAuto = new Auto("GDGFG4","Citroen", 237,"negro");
        myAuto.pruebaMetodoNoStatic();
        myAuto.pruebaMetodoStatic();
        // this.precio =this.precio - Auto.descuento; //El uso del this esta prohibido en metodos estaticos!!
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }


   public static void pruebaMetodoStatic (){
    System.out.println("Soy metodo Static");
    }

    public void pruebaMetodoNoStatic (){
        System.out.println("Soy metodo No Static");
    }
}

