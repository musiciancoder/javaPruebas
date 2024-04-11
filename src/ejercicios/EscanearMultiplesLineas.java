package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EscanearMultiplesLineas{

    public static void main(String[] args)
    {
//creating an object of the Scanner class
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
//takes the string input and prints the same string
            System.out.println(sc.nextLine());
        }
    }
}

class EscanearMultiplesLineasEsperando{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(sc.hasNext())
        {
            list.add(sc.nextLine());
        }
        System.out.println(list);
    }
}
