package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyArraylist {

    public static void main(String[] args) throws Exception {
        int linea;
        int lado;
        List <List> listaLista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<1 || n>20000){
            throw new Exception("Please enter number within given range!");
        }
        for (int i = 0; i < n; i++) {

            int d = scan.nextInt();
            if(d<0 || d>50000){
                throw new Exception("Please enter number within given range!");
            }
            List <Integer> lista = new ArrayList<>(d);
            for (int k = 0; k <d ; k++) {
                int num = scan.nextInt();
                lista.add(num);
            }

            listaLista.add(lista);


        }

        int q = scan.nextInt();
        if(q<1 || q>1000){
            throw new Exception("Please enter number within given range!");
        }

        int [][] queries = new int[q][2];

        for (int i = 0; i < q; i++) {



            int x = scan.nextInt();
            if(x<1 || x>n){
                throw new Exception("Please enter number within given range!");
            }
            queries[i][0] = x;

            int y = scan.nextInt();
            if(y<1 || y>n){
                throw new Exception("Please enter number within given range!");
            }
            queries[i][1] = y;
        }
        scan.close();


            for (int i = 0; i < q; i++) {


                linea = queries[i][0]; //listList
                lado = queries[i][1]; //list

                try {
                    List listeilor = listaLista.get(linea - 1);

                    int pos = (int) listeilor.get(lado - 1);
                    System.out.println(pos);



                } catch (IndexOutOfBoundsException e) {
                    System.out.println("ERROR!");
                }


            }

    }
}
