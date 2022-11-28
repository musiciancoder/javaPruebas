package clasesinternas;

//Notar que tanto para StaticPublicInnerClass como para StaticPrivateInnerClass, al ser ambas estaticas si las instanciamos dentro del main de la clase externa, funciona perfectamente

public class MyOuterClass {

    private String nombre;
    private int edad;

    public MyOuterClass(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static class StaticPublicInnerClass{
        public void imprimeStaticPublicInnerClass (){
            System.out.println("Im Static Public Inner Class");//notar que imprime sin problemas
        }
    }

    private static class StaticPrivateInnerClass{
        public void imprimeStaticPrivateInnerClass (){
            System.out.println("Im Static Private Inner Class");////notar que esto tambien lo imprime sin problemas
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void metodoPruebaOuter (){
     //   this.publicInnerVariable; // no tiene acceso!
    }

    @Override
    public String toString() {
        return "MyOuterClass{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {
        StaticPublicInnerClass staticPublicInnerClass = new StaticPublicInnerClass();
        staticPublicInnerClass.imprimeStaticPublicInnerClass();
        StaticPrivateInnerClass staticPrivateInnerClass = new StaticPrivateInnerClass();
        staticPrivateInnerClass.imprimeStaticPrivateInnerClass();
        MyOuterClass myOuterClassOne = new MyOuterClass("Andres",44);
       // InnerClassOne innerClassOne = new InnerClassOne("Ingeniero"); // no se pueden referenciar clases internas no estaticas desde un metodo estatico
        MyOuterClass.InnerClassOne myInner = myOuterClassOne.new InnerClassOne("Ingeniero");
        System.out.println(myOuterClassOne.toString()+" "+myInner.toString());
    }


    public class InnerClassOne {

        public String publicInnerVariable;
        private String privateInnerVariable;
        private String empleo;

        public InnerClassOne(String empleo) {
            this.empleo = empleo;
        }

        public String getEmpleo() {
            return empleo;
        }

        public void setEmpleo(String empleo) {
            this.empleo = empleo;
        }

        @Override
        public String toString() {
            return "InnerClassOne{" +
                    "empleo='" + empleo + '\'' +
                    '}';
        }

        // public static void main(String[] args) {} No se pueden usar metodos estáticos en clases internas!!
       public void metodoPruebaInner (){
            //  this.publicInnerVariable; //no tiene acceso
       }
    }

}
