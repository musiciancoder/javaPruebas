package mienum;

/*
Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors,
Java enums are automatically Serializable, there is no need to explicitly add the "implements Serializable" clause following the enum declaration.
Enums are thread safe
 */

public enum UsosTallas {

        //las variables TALLA_PEQUEÑA, MEDIANO Y GRANDE al estar definidas con esta sintaxis en un ENUM son por definicion public static y final, o sea son constantes.
        TALLA_PEQUENA("S"),
        MEDIANO("M"),
        GRANDE("G"); //CONSTANTE("VARIABLE")

    private final String miabreviatura; //campo de clase para generar constructor


    UsosTallas(String miabreviatura) { //constructor
        this.miabreviatura=miabreviatura;
    }

    public String getMiabreviatura() { //getter
        return miabreviatura;
    }

    public static void main (String[] args){
        System.out.println(TALLA_PEQUENA); //TALLA_PEQUENA
        System.out.println(TALLA_PEQUENA.getClass()); //class mienum.UsosTallas
        String talla= UsosTallas.TALLA_PEQUENA.toString();
        UsosTallas la_talla=Enum.valueOf(UsosTallas.class,talla);
        System.out.println("Talla: " + la_talla);//Talla: TALLA_PEQUENA
        System.out.println("Abreviatura: " + la_talla.getMiabreviatura());// Abreviatura: S
        System.out.println("Abreviatura:" + UsosTallas.TALLA_PEQUENA.getMiabreviatura());//Abreviatura: S

    }
}
