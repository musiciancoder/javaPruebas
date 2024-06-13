package patronesdiseno.creacionales.singleton.lazysingleton;

public class Client {

    public static void main(String[] args) {

        //Para lazy singleton
        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazySingleton1==lazySingleton2);
        //Para "lazy initiallization holder idiom"
        LazyRegistryIODH singleton; //notar q no se imprime lo q esta dentro del constructor de LazyRegistryIODH, por lo q el objeto no estará disponible apenas se cargue la clase, a diferencia de Eager Singleton
      //  LazyRegistryIODH.RegistryHolder holder; //notar q esto no se puede ni se debe, ya q la clase interna es privada y no publica. Es privada justamente para no poder ingresarla desde afuera
        singleton = LazyRegistryIODH.getInstance(); // aca recien se imprime, cuando se llama a getInstance()
        singleton = LazyRegistryIODH.getInstance(); //no imprime, porque en Lazy Singleton solo se crea un objeto una vez
        singleton = LazyRegistryIODH.getInstance();

    }
}
