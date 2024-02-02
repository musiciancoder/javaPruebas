package patronesdiseno.solid.liskovsubstitution.sin;

public class Cat extends Mammal{

    private boolean homeLoving;

    public Cat(String name, String color, boolean herbovore, boolean placental, boolean homeLoving) {
        super(name, color, herbovore, placental);
        this.homeLoving=homeLoving;
    }



    public boolean isHomeLoving() {
        return homeLoving;
    }

    public void setHomeLoving(boolean homeLoving) {
        this.homeLoving = homeLoving;
    }

    @Override
    public String eat(){
        return super.eat() ;
    }

    @Override
    public String jump() throws Exception {
        return super.jump() ;
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "homeLoving=" + homeLoving +
                '}';
    }
}
