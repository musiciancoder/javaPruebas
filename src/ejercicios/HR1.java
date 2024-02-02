package ejercicios;

import java.util.*;

public class HR1 {

    public static void main(String[] args) {
        //lee
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] tickets  = new int [n];
        for (int i = 0; i < n; i++) {
            tickets[i] = scan.nextInt();
        }

        //compara
        int a;
        int b;
        int c;
        int tam;
        int tamAnterior=0;
        int tamMax=0;
        for (int i = 0; i < tickets.length; i++) {
            Set<Integer> lista = new HashSet<>();
            b = tickets[i];
            a = b-1;
            c = b+1;
            for (int j = 0; j < tickets.length; j++) {
            //    System.out.println(b);
              //  System.out.println(tickets[j]);
                if (tickets[j]==a){
                    lista.add(tickets[j]);
                    lista.add(b);
                }
                if (tickets[j]==c){
                    lista.add(b);
                    lista.add(tickets[j]);

                }
            }
        tam = lista.size();
            if (tam>tamAnterior){
                tamMax= tam;
            }else {
                tamMax = tamAnterior;
            }
             tamAnterior = tam;

        }
       System.out.println(tamMax);
      //  System.out.println("tamMax: " + tamMax);
    }
}
