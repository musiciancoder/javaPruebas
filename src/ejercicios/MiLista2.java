package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiLista2 {
    public static void main(String[] args) {
        List<Integer>lista=new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String insertOrDelete;
        int posicionAInsertarORemover;
        int numeroAinsertar;
      int N=  s.nextInt();
        for (int i = 0; i < N; i++) {
           int numero= s.nextInt();
           lista.add(numero);
        }
        int q=  s.nextInt();
        for (int i = 0; i < q; i++) {
            insertOrDelete = s.next();

            if (insertOrDelete.equalsIgnoreCase("Insert")){
                posicionAInsertarORemover = s.nextInt();
                numeroAinsertar= s.nextInt();
                lista.add(posicionAInsertarORemover,numeroAinsertar);
            } else if (insertOrDelete.equalsIgnoreCase("Delete")) {
                posicionAInsertarORemover = s.nextInt();
                lista.remove(posicionAInsertarORemover);
            }
        }
        for (int res :
            lista ) {
            System.out.print(res + " ");
        }
    }
}
