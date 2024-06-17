package ejercicios;

import java.util.*;

/*Dado un string con multiples palabras separadas por un espacio, devolver la ocurrencia de cada palabra.
        Por ejemplo, String palabras = "hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ";*/
public class Entrevista {

    public static void main(String[] args) {
        String palabras = "hola como estas hola todo bien ? que se cuenta hola probando uno dos tres probando uno ";
        contadorPalabras(palabras);
    }

    private static void contadorPalabras(final String palabras) {
        // Desarrollar la lógica aquí
        String [] stringArray1 = new String[palabras.length()];
       stringArray1 = palabras.split(" ");
        Set<String> mySet = new HashSet<>(Arrays.asList(stringArray1));
       Iterator<String> it = mySet.iterator();
       while (it.hasNext()){
           int counter = 0;
           String str = it.next();
           for (int i = 0; i < stringArray1.length; i++) {
               if (str.equals(stringArray1[i])){
                   counter ++;
               }
           }
           System.out.println("La palabra ".concat(str).concat(" esta contenida ") + counter + " veces");
       }
    }
}
