package patronesdiseno.creacionales.builder;

public class Main {

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.id(2111);
        builder.brand("Lamborghini");
        builder.model("Countach");
        builder.color("red");

        Car car = builder.build();
        System.out.println("This is the car (NO director involved): " + car);

        Director director = new Director();
        CarBuilder builderToDirector = new CarBuilder();
        director.buildTesla(builderToDirector);

        Car carToDirector = builderToDirector.build();
        System.out.println("This is the car (director involved): " + carToDirector);


    }

}
