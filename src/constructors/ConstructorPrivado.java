package constructors;

 public class ConstructorPrivado {

    private String name;

    private ConstructorPrivado(String name) { //solo accesible en clases internas, por lo q solo se puede instanciar en clases internas
        this.name = name;
        System.out.println("Hi, I am private constructor");
    }

    public ConstructorPrivado() {
        System.out.println("Hi, I am public constructor from class ConstructorPrivado");
    }

    public static class ClaseInternaEstatica {

        public static void instantiate() {
            ConstructorPrivado privado = new ConstructorPrivado ("Andrés");
        }
    }
}

class Main {
    public static void main(String[] args) {
   //     ConstructorPrivado privado = new ConstructorPrivado ("Ibelys"); //no es posible esto pk el constructor es privado
        ConstructorPrivado publico = new ConstructorPrivado(); //aca llamamos al constructor publico
        ConstructorPrivado.ClaseInternaEstatica.instantiate();
    }

}
