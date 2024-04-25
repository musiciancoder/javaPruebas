package herencia.polimorfismo.duda;

//siempre la palabra reservada new es la que da la clase a la q pertenece el objeto, pero ojo, que solo los objetos que se instancias con la clase y no con la interfaz dispondrán
//de los métodos de esa clase

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new AcousticGuitar();
        System.out.println("guitar is of class:" + guitar.getClass()); // herencia.polimorfismo.duda.AcousticGuitar
        guitar.descriptionOfKind();
     //   acousticGuitar.descriptionOfShape("jumbo"); notar q no se puede !
        AcousticGuitar acousticGuitar = new AcousticGuitar();
        System.out.println("acousticGuitar is of class:" + acousticGuitar.getClass()); //herencia.polimorfismo.duda.AcousticGuitar
        acousticGuitar.descriptionOfKind();
        acousticGuitar.descriptionOfShape("jumbo");
    }

    public static AcousticGuitar metodoPrueba(){
        Guitar guitar2 = new AcousticGuitar();
        System.out.println(guitar2 instanceof Guitar);
        System.out.println(guitar2 instanceof AcousticGuitar);
        return (AcousticGuitar) guitar2;

        /*
            public static AcousticGuitar metodoPrueba(){
        Guitar guitar2 = new AcousticGuitar();
        System.out.println(guitar2 instanceof Guitar);
        System.out.println(guitar2 instanceof AcousticGuitar);
        return guitar2;
         */
    }
}
