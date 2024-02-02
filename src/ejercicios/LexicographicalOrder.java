package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        List <String>lista = new ArrayList<>();
         String sub = null;
         int i =0;
        while ((k+i)<=s.length()){
          sub=  s.substring(i,k+i);

            lista.add(sub);
            i++;
        }

        Collections.sort(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(lista.size()-1));

    }



}
