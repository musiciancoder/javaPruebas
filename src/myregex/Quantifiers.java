package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

    //Para devolver un booleano si hay un numero determinado de ocurrencias y este numero debe ser conocido de antemano


       //Ocurrencia de exactas tres veces seguidas para caracteres
        System.out.println("UNO----------------------");
       Pattern p = Pattern.compile("i{3}"); // pero ojo, que tienen q ser tres veces consecutivas, por eso no va a funcionar en esta frase: "la miel es muy rica y nutritiva"
        Matcher m = p.matcher("triii"); //
        System.out.println(m.matches());//returns true
        m = p.matcher("....");
        System.out.println(m.matches());//returns false



        //Ocurrencia de solo una vez, nunca cero ni mas de una vez
        System.out.println("TRES----------------------");
        Pattern p3 = Pattern.compile("i?");
        Matcher m3 = p3.matcher("hola");
        System.out.println(m3.matches());//returns false
        m3 = p3.matcher("i");
        System.out.println(m3.matches());//returns true
        m3 = p3.matcher("iii");
        System.out.println(m3.matches());//returns false



        //Ocurrencia de una o varias veces, nunca de cero veces
        System.out.println("CUATRO----------------------");
        Pattern p4 = Pattern.compile("i*");
        Matcher m4 = p4.matcher("hola");
        System.out.println(m4.matches());//returns false  --> esto esta raro !!!!!
        m4 = p4.matcher("i");
        System.out.println(m4.matches());//returns true
        m4 = p4.matcher("iii");
        System.out.println(m4.matches());//returns true



        //Ocurrencia de una o varias veces, nunca de cero veces
        System.out.println("CINCO----------------------");
        Pattern p5 = Pattern.compile("i+");
        Matcher m5 = p5.matcher("hola");
        System.out.println(m5.matches());//returns false
        m5 = p5.matcher("i");
        System.out.println(m5.matches());//returns true
        m5 = p5.matcher("iii");
        System.out.println(m5.matches());//returns true




        //Ocurrencia de dos veces o mas
        System.out.println("SEIS----------------------");
        Pattern p6 = Pattern.compile("i{2,}");
        Matcher m6 = p6.matcher("hola");
        System.out.println(m6.matches());//returns false
        m6 = p6.matcher("i");
        System.out.println(m6.matches());//returns false
        m6 = p6.matcher("ii");
        System.out.println(m6.matches());//returns true

        //Ocurrencia de dos veces a cuatro veces
        System.out.println("SIETE----------------------");
        Pattern p7 = Pattern.compile("i{2,4}");
        Matcher m7 = p6.matcher("hola");
        System.out.println(m7.matches());//returns false
        m7 = p7.matcher("i");
        System.out.println(m7.matches());//returns false
        m7 = p7.matcher("ii");
        System.out.println(m7.matches());//returns true
        m7 = p7.matcher("iiiiii");
        System.out.println(m7.matches());//returns false




}


    }

