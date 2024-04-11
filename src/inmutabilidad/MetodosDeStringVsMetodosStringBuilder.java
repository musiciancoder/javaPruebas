package inmutabilidad;

public class MetodosDeStringVsMetodosStringBuilder {

    public static void main(String[] args) {
        String str = "soy string, no soy substring";
        System.out.println("hashcode str original:" + str.hashCode());
        str =str.substring(15);
        System.out.println(str);
        System.out.println("hashcode str nuevo:" + str.hashCode());

    }

}
