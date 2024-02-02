package patronesdiseno.solid.liskovsubstitution.good;

public class Cat extends LittleMammal{

    private boolean homeLoving;
    public Cat(String name, String color, boolean herbovore, boolean placental, boolean homeLoving) {
        super(name, color, herbovore, placental);
        this.homeLoving=homeLoving;
    }

    @Override
    public String jump()  {
        return "can jump";
    }
}
