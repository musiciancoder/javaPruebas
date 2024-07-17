package herencia.abstraccion;

public abstract class ClaseA {

    private String color;

    public ClaseA(String color) {
        this.color = color;
    }

    public String teMuestroElColor(){
        color ="azul";
        return color;
    }

    void tedigoOtraCosa() {}


}
