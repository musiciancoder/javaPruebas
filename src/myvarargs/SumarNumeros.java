package myvarargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Add {


        public void add(int... n) { //es una sintaxis para uno, dos o mil argumentos del mismo tipo sin usar sobrecarga de metodos
            int result = 0;
            for (int i = 0; i < n.length; i++) {
                result += n[i];
                System.out.print(n[i]);
                if(i < n.length-1){
                    System.out.print("+");
                }
            }
            System.out.println("="+result);
        }
    }




public class SumarNumeros {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




}


