package encapsulamiento.usosuper;

public class ClassB extends ClassA{

    private int estatura;

    public ClassB(String nombre, int edad, String direccion, int rut, int estatura) { //aca sí podemos llamar a nombre, pero porque le estamos pasanod argumentos
        super(nombre, edad, direccion, rut);
        this.estatura= estatura;
    }

    public void methodB(){
        //notar que no podemos llamar a nombre porque es privado y no le estamos pasando argumentos.
        super.edad = 23;
        super.direccion="Madrid 230";
        super.rut=12997645;
        super.setNombre("Andres"); //en general todos los getter and setter (que generalmente son publicos) pueden ser llamados con super.
    }

}
