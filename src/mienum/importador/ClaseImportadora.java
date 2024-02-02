package mienum.importador;

import mienum.exportador.Colores;

public class ClaseImportadora {

    public static void main(String[] args) {
        System.out.println(Colores.VERDE + " CLARO"); //notar que permite sumar con string pese a que Colores no es un String;
        System.out.println(Colores.VERDE.getClass().getTypeName());


    }
}
