package patronesdiseno.estructurales.bridge.gringo;

public class TVRemotePause extends RemoteButton{ // para tele con dvd, la idea es que el botón 9 pause


    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}
