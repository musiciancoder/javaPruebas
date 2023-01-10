package patronesdiseno.estructurales.bridge.gringo;

//This the refined abstraction
public class TVRemoteMute extends RemoteButton{ // para tele sin dvd, la idea es que el botón 9 mutee


    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }
}
