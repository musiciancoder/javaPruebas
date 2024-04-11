package genericos.hackerrank;

public class MyGeneric <T> {

    private T t;

    public MyGeneric(T t) {
        this.t = t;
    }

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
