package patronesdiseno.conductuales.command.sincommand;

public class Room {

    private Light light;

    public Room(Light light) {
        this.light = light;
    }

    public  void switchLights(){
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
