package patronesdiseno.estructurales.bridge.gringo;

//Esta es clase concreta para la tele
public class TVDevice extends EntertainmentDevice{

    public TVDevice(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting=newMaxSetting;
    }
    @Override
    public void buttonFivePressed() { //canal anterior
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() { // canal siguiente
        System.out.println("Channel Up");
        deviceState++;

    }
}
