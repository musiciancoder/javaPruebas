package herencia;

public class PruebasObjetos {


//Para ver jerarquia: doble click en la clase (en Object por ejemplo) y ctrl +H. Tambien con View + Type Hyerarchy


}

class MiObjeto {

    private Object object;
    private String string;

    public MiObjeto(Object object, String string) {
        this.object = object;
        this.string = string;
    }
}

class MiObjeto2 extends MiObjeto{

    private String string2;

    public MiObjeto2(Object object, String string, String string2) {
        super(object, string);
        this.string2 = string2;
    }
}