package ejercicios;

import java.util.*;

public class UltimaLetraPrimeraLetra {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        String palabra = scanner.nextLine();
/*        List<String> list = new LinkedList<>();
        list = Arrays.asList(palabra.split(""));
        LinkedList <String> le = new LinkedList<>();
        le = (LinkedList<String>) list; //no se puede!
        String ultima = le.peekLast();camion
        if (ultima.equals("n")||ultima.equals("s")||ultima.equals("a")||ultima.equals("e")||ultima.equals("i")||ultima.equals("o")||ultima.equals("u")) {
            String sacaPone = le.remove();
            le.addFirst(sacaPone);
        }
        System.out.println(le);*/
        List<String> list = new LinkedList<>(Arrays.asList(palabra.split("")));

      LinkedList<String>  le = (LinkedList<String>) list;
        String ultima = le.peekLast();
        if (ultima.equals("n")||ultima.equals("s")||ultima.equals("a")||ultima.equals("e")||ultima.equals("i")||ultima.equals("o")||ultima.equals("u")) {
            String sacaPone = le.remove();
            le.addLast(sacaPone);
        }
        System.out.println(le);
    }
}
