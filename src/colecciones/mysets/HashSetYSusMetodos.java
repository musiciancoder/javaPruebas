package colecciones.mysets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetYSusMetodos {

    public static void main(String[] args) {

        Set<Foo> set = new HashSet<Foo>();
        set.add(new Foo("Hello"));

        for (Iterator<Foo> it = set.iterator(); it.hasNext(); ) {
            Foo f = it.next();
            if (f.equals(new Foo("Hello"))) //esto reemplaza al metodo get(i) q no esta disponible en Set ni en Hashset
                System.out.println("foo found");
        }
    }

    static class Foo {
        String string;
        Foo(String string) {
            this.string = string;
        }
        @Override
        public int hashCode() {
            return string.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            return string.equals(((Foo) obj).string);
        }
    }
    }

