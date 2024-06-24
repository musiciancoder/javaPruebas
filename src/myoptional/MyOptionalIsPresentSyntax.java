package myoptional;

import java.util.Optional;

public class MyOptionalIsPresentSyntax {

    public static void main(String[] args)  {
        Cat chica = new Cat("gris", null);
        Optional <Integer> edadChica = edadDeUnGato(chica);
        if (edadChica.isPresent()) { //esto es similar a if(edadChica!=null), solo que es una alternativa mas eficiente porque no escribimos null en el código
            System.out.println(edadChica.get()); //notar q el get() siempre debe ir dentro de un isPresent()
        }else {
            System.out.println(0); //Sale el mismo NullpointerException que es MyOptional1 y no 0, esto no debiera ocurrirme y yo creo q es porque el pelao no escribe un
            //null en forma explicita (yo si lo hago en la linea 8), sino que el codigo se lo da ya que recordar que la clase Cat de él no es la misma mia
        }
    }

        private static Optional<Integer> edadDeUnGato(Cat cat) { //El gringo pelao de youtube recomienda siempre usar los Optional en el return, no como argumento (si bien es posible hacerlo).
            Optional<Integer>integerOptional = Optional.of(cat.getAge()); //Segun entiendo se usa of cuando se tiene certeza de que no debiera existir un optional empty (optional empty es lo mismo que un null, recordar que en los optionals se trabaja con otional empty en vez de null)
                 //Optional<Integer>integerOptional = Optional.ofNullable(cat.getAge());    //se usa ofNullable() cuando se sabe que se tiene mas posibilidades de obtener un null
            return integerOptional;
        }
    }

