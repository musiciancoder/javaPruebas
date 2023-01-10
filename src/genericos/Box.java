package genericos;

public class Box <T>{

    //Instance variable
    private T t;

    //Parametrized constructor
    public Box(T t) {
        this.t = t;
    }

    //Returns the casted value by the method signature
    public T get() {
        return t;
    }

    public void getGenericType (){
        if (t.getClass().toString().contains("String")){
            System.out.println("The generic is a String");
            return;
        }
        System.out.println(("The generic is NOT a String"));

    }
}
