package patronesdiseno.creacionales.builder;

public class CarBuilder {

    //Ojo que tambien se pueden usar interfaces para los builders. (esto no se explica en este código, pero esta en este video: https://www.youtube.com/watch?v=MaY_MDdWkQw
    private int id;
    private String brand;
    private String model;
    private String color;
    private int noDoors;


    //Estos son los setters
    public void id (int id){
        this.id=id;
    }

    public void brand(String brand){
        this.brand=brand;
    }

    public void model(String model){
        this.model=model;
    }

    public void color (String color){
        this.color=color;
    }

    public void noDoors (int noDoors){
        this.noDoors=noDoors;

    }


    public Car build(){
        return new Car(id,brand,model,color,noDoors);
    }




}
