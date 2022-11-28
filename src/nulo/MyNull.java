package nulo;

public class MyNull {

    public static void main(String[] args) {
        Cat chica = new Cat("chica");
        Cat cheetarah;
        Cat rita = null;

       // cheetarah.sound(); //java does not allow methods for non-initialized variables
        System.out.println(chica.hashCode());
        System.out.println(chica.toString());
        System.out.println(rita);//imprime null
        System.out.println(rita.getName());//manda error
        System.out.println(rita.hashCode());

    }

}

class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound (){
        System.out.println("Cat says miaw!");
    }

    @Override
    public String toString() {
        return "The cat is: " + this.getName();
    }
}
