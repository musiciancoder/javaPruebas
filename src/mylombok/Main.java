package mylombok;

public class Main {

    public static void main(String[] args) {
        Cat chica = new Cat("Chica", 6, 3); //notar que pide los argumentos del constructor debido a @AllArgsConstructor

        System.out.println(chica); //notar que lo tira como string por @Data


    }
}
