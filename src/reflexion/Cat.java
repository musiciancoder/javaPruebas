package reflexion;

public class Cat {

    private final String name; //private final en una variable que forma parte de un constructor significa que no podemos cambiar el atributo luego que se lo hemos pasado como argumento del constructor como parametro, ni siquiera a través de un setter (de hecho nunca van a poder llevar setter)
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void miau(){
        System.out.println("Miau");
    }

    private void heyThisIsPrivate(){
        System.out.println("this method is private!!!");
    }

    public static void thisIsAPublicStaticMethod(){
        System.out.println("this method is public and static");
    }

    private static void thisIsAPrivateStaticMethod(){
        System.out.println("this method is public and static");
    }
}
