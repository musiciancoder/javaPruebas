package patronesdiseno.creacionales.builder;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final int noDoors;

    Car(int id, String brand, String model, String color, int noDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.noDoors=noDoors;
    }

    @Override
    public String toString() {
        return "id: " + id + "; brand: " + brand + "; model: " + model + "; color: " + color + "; noDoors: " + noDoors;
    }


}
