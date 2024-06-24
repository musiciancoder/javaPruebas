package myoptional;

public class SinOptional {

    public static void main(String[] args) {
        Cat chica = new Cat("gris",null);
        System.out.println(edadDeUnGato(chica)); //NullPointerException, la idea del oprional es tener mayor flexibilidad cuando recibimos un null
    }

    private static int edadDeUnGato(Cat cat) {
        int edadDeUnGato = cat.getAge();
        return edadDeUnGato;
    }


}

class Cat {
    private String color;
    private int age;

    public Cat(String color, Integer age) { //notar q para q se pueda trabajar con null, en el constructor debe ir el wrapper class Integer, no int.
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
