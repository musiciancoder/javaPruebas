package constructors;

/*
Se usa final en instance variables cuando deseamos que solo pueda setearse el valor del atributo una vez y siempre por constructor al instanciar, nunca por setters.
 */

public class AtributosFinal {
   private final String name;

    public AtributosFinal(String name) {
        this.name = name;
    }



    //notar q no estan disponibles los setters, solo los getters
}
