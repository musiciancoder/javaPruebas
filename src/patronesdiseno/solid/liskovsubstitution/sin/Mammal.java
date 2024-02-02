package patronesdiseno.solid.liskovsubstitution.sin;

public class Mammal {

    private String name;



    private String color;
    private boolean herbovore;
    private boolean placental;

    public Mammal(String name, String color, boolean herbovore, boolean placental) {

        this.color = color;
        this.herbovore = herbovore;
        this.placental = placental;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHerbovore() {
        return herbovore;
    }

    public void setHerbovore(boolean herbovore) {
        this.herbovore = herbovore;
    }

    public boolean isPlacental() {
        return placental;
    }

    public void setPlacental(boolean placental) {
        this.placental = placental;
    }

    public String eat(){
        return "Animal " + this.getName() + "can eat";
    }

    public String jump() throws Exception { //No elephant class, no need to add exception here.
        return "can jump";
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", herbovore=" + herbovore +
                ", placental=" + placental +
                '}';
    }
}
