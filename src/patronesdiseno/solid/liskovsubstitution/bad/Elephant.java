package patronesdiseno.solid.liskovsubstitution.bad;

public class Elephant extends Mammal implements Eat,Jump{
    public Elephant(String name, String color, boolean herbovore, boolean placental, boolean b) {
        super(name, color, herbovore, placental);
    }

    @Override
    public String eating() {
         return "Animal " + this.getName() + "can eat";
    }

    @Override
    public String jumping() {
        return "Animal " + this.getName() + "can jump";
    }
}
