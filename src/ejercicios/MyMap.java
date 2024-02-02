package ejercicios;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class MyMap{
    public static void main(String []argh)
    {
    Scanner scan = new Scanner(System.in);
    //n
        int n = scan.nextInt();
        scan.nextLine();
        String myString, query;
        Integer myInteger;
        Map<String,Integer> mapa= new HashMap<String,Integer>();
        for (int i = 0; i < n; i++) {
        myString= scan.nextLine();
        myInteger= Integer.valueOf(scan.nextLine());
        mapa.put(myString,myInteger);
        }
        //queries
        while (scan.hasNext()){
             query = scan.nextLine();
             if(mapa.containsKey(query)){
                 System.out.println(query + "=" + mapa.get(query));
             }else
             {
                 System.out.println("Not found");
             }
        }
        scan.close();
    }
}