package patronesdiseno.creacionales.singleton.lazysingleton;
/*
The lazy initialization holder idiom which provides best of both worlds, you dont deal with syncronization issues directly and is easy to implement
 */

public class LazyRegistryIODH { //ejemplo sin tener q preocuparnos de sincronizacion (a dferencia de LazyRegistryWithDCL), llamado "lazy initiallization holder idiom", q intuyo q es lo mas usado en programacion real

    private LazyRegistryIODH() { //notar q es privado para q solo un metodo perteneciente a la clase pueda llamar al constructor
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH(); //notar que la instancia se crea al llamar a la clase interna, no al llamar al constructor de mas arriba.
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
