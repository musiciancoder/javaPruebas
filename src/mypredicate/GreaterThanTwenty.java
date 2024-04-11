package mypredicate;

import java.util.function.Predicate;

public class GreaterThanTwenty{

    public static void main(String[] args) {
         /*
         Predicate siempre devuelve un boolean
         interface Predicate<T>{ //esta es la interface Predicate q ya viene incluida en java 8
         public boolean test(T t);
         }
          */


        Predicate<Integer>p = i->i>20; //el i es un Integer. Notar q el lado izquierdo de esta expresion es un predicado, y los predicados son interfaces funcionales, que como tal  pueden ser expresados a traves de funciones lambda (lado derecho de la expresion)

        System.out.println(p.test(15)); //p.test() devuelve siempre un boolean
        System.out.println(p.test(24));
        System.out.println(p.test(30));

    }
}
