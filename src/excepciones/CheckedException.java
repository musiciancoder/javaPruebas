package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {

        try {
            readFile("rfjjgjg.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Despues del try-catch");
        }

        otrometodo();
    }

    private static void otrometodo() {
        System.out.println("Soy otro metodo"); //esta linea sí se imprime, es decir el programa no se cae
    }

    private static void readFile(String fileName) throws IOException { //se nos obliga a escribir throws IOException porq es una checkes exception
        System.out.println("first line on readFile");
        FileReader reader = new FileReader(fileName);
        System.out.println("last line on readFile"); //Esta linea no se imprime notar que cuando el metodo se cae no llega hasta el final
    }

}
