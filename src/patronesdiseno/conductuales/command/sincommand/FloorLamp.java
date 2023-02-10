package patronesdiseno.conductuales.command.sincommand;

public class FloorLamp {


    //notar q como FloorLamp no es un Room, no podemos extender de room, por lo
    //q nos vemos obligados a duplicar el codigo del metodo switchLights()
    private Light light;

    public FloorLamp(Light light) {
        this.light = light;
    }

    public  void switchLights(){
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
