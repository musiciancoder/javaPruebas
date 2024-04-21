package arraycollectionstring;

import java.util.*;
import java.util.stream.Stream;

public class ListasModificablesEInmodificables {

    public static void main(String[] args) {

        //Cuando agregamos la palabra reservada "new" estamos creando colecciones modificables
        //Ojo que modificable no es sinonimo de mutable, ya que este último tiene que ver con los hashcodes

        //lista modificable
    List<String>listaModificable = new LinkedList<>();
    listaModificable.add("maple");
    listaModificable.add("oak");
    listaModificable.add("ebony");
        System.out.println(listaModificable);

        //lista Inmodificable
      //  List<String>listaInmodificable = new ArrayList<>(List.of("Fender", "Gibson", "PRS"));  //Sí es modificable, porque estamos usando la palabra reservada "new"
         List<String>listaInmodificable = List.of("Fender", "Gibson", "PRS");  //No es modificable !!
        //listaInmodificable.add("Ibanez"); // no se puede !!
        System.out.println(listaInmodificable);

        //lista Inmodificable
      //  List<String>listWithStreams =new ArrayList<>(Stream.of("Fender", "Gibson", "PRS").toList()); //Sí es modificable, porque estamos usando la palabra reservada "new"
        List<String>listWithStreams =(Stream.of("Fender", "Gibson", "PRS").toList());  //No es modificable !!

      //  listWithStreams.add(1,"Ibanez"); // no se puede !!
        System.out.println(listWithStreams);


                /*
        Ingresar
3
Slash
Vai
Johnson
         */

        //lista Inmodificable (con scanner)
       Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // "Unmodifiable" but arrayList is still Mutable
        List<String> arrayList = new ArrayList<>();



       while (n>0){
          arrayList.add(scanner.nextLine());
          n--;
       }
       scanner.close();
        System.out.println(arrayList);
        List<String> unmodifiableListList = Collections.unmodifiableList(arrayList);
      //  unmodifiableListList.add("Satriani"); //no se puede !!
        System.out.println(unmodifiableListList);



}



}
