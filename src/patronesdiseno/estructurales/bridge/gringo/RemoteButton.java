package patronesdiseno.estructurales.bridge.gringo;

//This is the abstraction layer
public abstract class RemoteButton { //este es el botón se comportará diferente para una tele sin dvd que para una tele con dvd

    private EntertainmentDevice theDevice;

    public RemoteButton (EntertainmentDevice newDevice){
        theDevice = newDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

public abstract void buttonNinePressed();


}
