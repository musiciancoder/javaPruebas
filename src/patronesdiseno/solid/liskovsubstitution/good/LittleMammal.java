package patronesdiseno.solid.liskovsubstitution.good;

public class LittleMammal extends Mammal{
    public LittleMammal(String name, String color, boolean herbovore, boolean placental) {
        super(name, color, herbovore, placental);
    }

    public String jump()  {
        return "can jump";
    }
}
