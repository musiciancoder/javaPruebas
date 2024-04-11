package genericos;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Box<String>stringBox=new Box<>("soy t");
        Box<Integer>integerBox=new Box<>(12);
        //Box<int>intBox=new Box<>(12); //no se pueden usar primitivas en genéricos

        System.out.println(stringBox.get());
        System.out.println(integerBox.get());
        stringBox.getGenericType();

    }
}
