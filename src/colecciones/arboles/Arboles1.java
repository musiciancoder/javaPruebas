package colecciones.arboles;

import java.util.TreeSet;

public class Arboles1 {

    public static void main(String[] args) {

        //TreSet implements Set, therefore it does not take on duplicates. It authomaticallyhands out results in alphabetical order (Strings), ascending
        // order (numbers) or customized order for pojos.
        //If we want duplicated values for customized pojos we need to use PriorityQueue
        TreeSet <String>arbol1  = new TreeSet <String>();
        arbol1.add("Sandra");
        arbol1.add("Amanda");
        arbol1.add("Diana");
        arbol1.add("Diana"); //los arboles son sets, y como tal no aceptan duplicados.

        System.out.println(arbol1); //Note it returns results by alphabetical order authomatically. This is because String class implements Comparable with CompareTo method sorting in alphabetical order by default

        //arbol1.get(0);  no esta disponible porq es un set
        TreeSet <Integer>arbol0  = new TreeSet <>();
        arbol0.add(234);
        arbol0.add(80);
        arbol0.add(1986);

        System.out.println(arbol0); //Note it returns results in an ascending order

        TreeSet <Articulo>arbol2  = new TreeSet <Articulo>();
        System.out.println(arbol2);
        System.out.println("comparados por numero de articulo");

        arbol2.add(new Articulo(1,"primer articulo"));
        arbol2.add(new Articulo(200,"segundo articulo"));
        arbol2.add(new Articulo(3,"tercer articulo"));

        System.out.println(arbol2);

        System.out.println(" ");

       Articulo comparadorArticulos = new Articulo();

        System.out.println(comparadorArticulos);

        System.out.println(" ");

       TreeSet<Articulo>ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos); //TODO ¿POR QUÉ NECESITA INICIALIZARLO COMO CONSTRUCTOR VACÍO PARA QUE LE FUNCIONE EL COMPARE?

        System.out.println(ordenaArticulos2);

        System.out.println(" ");

        ordenaArticulos2.add(new Articulo(1,"primer articulo"));
        ordenaArticulos2.add(new Articulo(200,"segundo articulo"));
        ordenaArticulos2.add(new Articulo(3,"tercer articulo"));

        System.out.println("ordenados por descripcion, no por numero");
        System.out.println(ordenaArticulos2);

        System.out.println(" ");

        ComparadorArticulos comp_art = new ComparadorArticulos();

        TreeSet<Articulo2>ordenaArticulos3=new TreeSet<Articulo2>(comp_art);


        ordenaArticulos3.add(new Articulo2(1,"primer articulo"));
        ordenaArticulos3.add(new Articulo2(200,"segundo articulo"));
        ordenaArticulos3.add(new Articulo2(3,"tercer articulo"));

        System.out.println("ordenados por descripcion, no por numero");

        System.out.println(ordenaArticulos3); //ordenados por descripcion, no por numero


    }


}
