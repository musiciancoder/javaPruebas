import java.util.function.Function;

public class myfunction {
    public static void main(String[] args) {
        /*
        Como el predictae, pero siempre devuelve un valor, no un boolean
         */
        Function<String,Integer> f= s->s.length();
        System.out.println(f.apply("Barath"));
        System.out.println(f.apply("John"));
    }
}
