package patronesdiseno.creacionales.singleton.eagersingleton;

public class Client {

    public static void main(String[] args) {
      //  EagerRegistry registry = new EagerRegistry(); //esto no se puede hacer ni se debe hacer porq la idea es crear la instancia mediante getInstance()
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry == registry2); //reference in memory comparison, which verifies its singleton nature
    }
}
