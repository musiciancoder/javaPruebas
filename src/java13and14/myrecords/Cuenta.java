package java13and14.myrecords;

//Records are immutable (immutable class-->hashcode() and equals() must be overriden). On records, hashcode() and equals() are automatically overritten for us.
//toString() is also automatically overritten for us.
//private, final field for each piece of data (in this case String nombre, String clave, boolean privilegiada )
//getter for each field
//extra static variables and methods are allowed

public record Cuenta(String nombre, String clave, boolean privilegiada) { //canonic constructor

    public Cuenta(String nombre, String clave){ //additional constructor (it is optional)
         this(nombre, clave,false); //additional constructor is forced to call canonic constructor, otherwise will not compile
    }

    public String identificador(){ //extra methos (it is optional)
       return "@" + nombre;
    }

    public void  tienePrivilegios(){
        if(this.privilegiada){
            System.out.println("Tiene privilegios");
        } else {
            System.out.println("Es regular");
        }
    }

    public void restringir(){
      //  this.privilegiada = true; // we cannot change value with "=" because record variables are always final
    }
}

class MainClass {

    public static void main(String[] args) {
        Cuenta c = new Cuenta("admin", "root", true);
        System.out.println(c.identificador());
        //Notice toString() method is not written explicitly in the record
        System.out.println(c.toString()); // result Cuenta[nombre=admin, clave=root, privilegiada=true]
        if (c.equals(new Cuenta("admin","root",true))){ //Result Iguales. This is because records, just like Strings, are always immutable
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
        System.out.println(c.clave()); //On records getters are invoked by attributename() -->c.clave instead of c.getClave()
    }
}
