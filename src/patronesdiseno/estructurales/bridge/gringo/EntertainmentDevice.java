package patronesdiseno.estructurales.bridge.gringo;


abstract class EntertainmentDevice { //este es el control remoto para todos los dispositivos (tele o dvd). A veces este tipo de clases se explica como interfaz en vez de clase abstracta.

public int deviceState; //representa el canal en el caso de control pa la tele o capitulo en el caso de control pa dvd

    public int maxSetting; // numero maximo de canales o de capitulos

    public int volumeLevel=0; //volumen

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedback(){
        if (deviceState>maxSetting || deviceState<0){
            deviceState=0;
        }
        System.out.println("On " + deviceState);
    }

    public void buttonSevenPressed(){
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel );
    }

}
