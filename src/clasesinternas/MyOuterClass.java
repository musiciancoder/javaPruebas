package clasesinternas;

/*
Razones para crear una clase interna
- Para acceder a los campos privados de una clase (externa) desde otra clase (interna) sin modificadores de acceso (o sea instanciar y ocupar getter ni setter)
- Para ocultar una clase de otras pertenecientes al mismo paquete
- Para crear clases internas "anónimas", muy útiles para gestionar eventos y retrollamadas

 */

public class MyOuterClass {

    private String nombre;
    private int edad;

    public MyOuterClass(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static class StaticPublicInnerClass {
        public void imprimeStaticPublicInnerClass() {
            System.out.println("Im Static Public Inner Class");//notar que imprime sin problemas
        }
    }

    private static class StaticPrivateInnerClass {
        public void imprimeStaticPrivateInnerClass() {
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

    public void metodoPruebaOuter() {
        //   this.publicInnerVariable; // no tiene acceso!
    }

    @Override
    public String toString() {
        return "MyOuterClass{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


    class InnerClassOne {

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
        public void metodoPruebaInner() {
            //  this.publicInnerVariable; //no tiene acceso
        }
    }

    static class InnerClassTwo { //esto es lo mas correcto para una clase interna (con private en el caso que la clase externa sea la clase principal)

        public String publicInnerVariable;
        private String privateInnerVariable;
        private String empleo;

        public InnerClassTwo(String empleo) {
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

    }
}

    class MainClass {

        public static void main(String[] args) {
            MyOuterClass.StaticPublicInnerClass staticPublicInnerClass = new MyOuterClass.StaticPublicInnerClass();
            staticPublicInnerClass.imprimeStaticPublicInnerClass(); //notar que al hacer la clase interna estatica no dependemos de la clase externa
            //   MyOuterClass.StaticPrivateInnerClass staticPrivateInnerClass = new MyOuterClass.StaticPrivateInnerClass(); //no se puede porque clases internas privadas solo se usan dentro de la clase externa. Si este metodo main() estuviera en clase MyOuterClass entonces si se podria
            staticPublicInnerClass.imprimeStaticPublicInnerClass(); //notar que al hacer la clase interna estatica no dependemos de la clase externa
            MyOuterClass myOuterClassOne = new MyOuterClass("Andres", 44);
            //     MyOuterClass.InnerClassOne innerClassOne = new MyOuterClass.InnerClassOne("Ingeniero"); // no se pueden intanciar clases internas sin el uso de una instancia de la clase externa
            MyOuterClass.InnerClassOne myInner = myOuterClassOne.new InnerClassOne("Ingeniero");  //notar que al hacer la clase interna no estatica, entonce sí dependemos de una instancia la clase externa

            System.out.println(myOuterClassOne.toString() + " " + myInner.toString());
            MyOuterClass.InnerClassTwo innerClassTwo = new MyOuterClass.InnerClassTwo("Medico"); //no se necesita instancia de la clase interna, ya q InnerClassTwo es estatica
            System.out.println(innerClassTwo.toString());

        }

    }
