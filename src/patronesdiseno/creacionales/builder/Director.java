package patronesdiseno.creacionales.builder;

public class Director {

    //Director is opcional, it is used when we want to set appart some constant attributes from the class, like brand or noDoors in this case.


    public void buildTesla(CarBuilder builder){
        builder.brand("Tesla");
        builder.noDoors(2);
    }

    public void buildSuzuki(CarBuilder builder){
        builder.brand("Suzuki");
        builder.noDoors(4);
    }

}
