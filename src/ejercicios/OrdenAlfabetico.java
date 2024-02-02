package ejercicios;

import java.util.*;

public class OrdenAlfabetico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String>lista=new ArrayList<>();
        String str;

        while (scan.hasNext()){
          str=  scan.nextLine();
          lista.add(str);
          if (str.equalsIgnoreCase("sanchez")){
              break;
          }
        }
        String[] array = lista.toArray(String[]::new);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Collections.sort(lista);

        System.out.println(lista);

    }
}
