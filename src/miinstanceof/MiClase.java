package miinstanceof;

public class MiClase {

    public static void main(String[] args) {
        Object object = get ();
/*        if (object instanceof String){
            String str = (String)object;
            System.out.println(str);
        }*/
       //esto es equivalente a las lineas comentadas anteriormente. Como se puede apreciar, no se necesita hacer un downcasting cuando se usa instanceof
        if (object instanceof String str){
            System.out.println(str);
        }
    }

    public static Object get () {
        return "Pattern matching in action";
    }
}
