
package patronesdiseno.solid.liskovsubstitution.sin;

public class Elephant extends Mammal{

    private boolean haveIvory;


    public Elephant(String name, String color, boolean herbovore, boolean placental, boolean haveIvory) {
        super(name, color, herbovore, placental);
        this.haveIvory=haveIvory;
    }

    public boolean isHaveIvory() {
        return haveIvory;
    }

    public void setHaveIvory(boolean haveIvory) {
        this.haveIvory = haveIvory;
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String jump() throws Exception {
         throw new Exception("Elephants cannot jump");
    }

    @Override
    public String toString() {
        return super.toString() +"Elephant{" +
                "haveIvory=" + haveIvory +
                '}';
    }
}

