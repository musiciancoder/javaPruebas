package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Ejercicio2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
         //   System.out.println(IP.matches(MyRegex.pattern));//mio
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {

   //  String pattern = "([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)\\.([0-9]|[1-9][0-9]|255)"; //mio
    String pattern = "(((25[0-5])|(2[0-4]\\d)|([0-1]?\\d{1,2}))(\\.|$)){4}";

}