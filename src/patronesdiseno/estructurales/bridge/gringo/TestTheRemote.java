package patronesdiseno.estructurales.bridge.gringo;

public class TestTheRemote {

    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200) );
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200) );
//        RemoteButton theDVD = new DVDRemotePause(new TVDevice(1,24) ); // si quisieramos hacerlo para el dvd tb se puede pero tendiamos que hace lo mismo q hicimos pa la tele para el dvd
        System.out.println("Test TV with mute");
        theTV.buttonFivePressed();

        System.out.println("\nTest TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();


    }
}
