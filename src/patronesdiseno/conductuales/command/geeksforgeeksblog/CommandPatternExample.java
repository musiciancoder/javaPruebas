package patronesdiseno.conductuales.command.geeksforgeeksblog;

//https://www.geeksforgeeks.org/command-pattern/

// Command interface
interface Command {
    void execute();
}

// Concrete command for turning a device on
class TurnOnCommand implements Command {
    private Device device; //tiene al receiver como atributo

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn(); //Ocupa un método del receiver dentro del metodo del command a sobrescribir
    }
}

// Concrete command for turning a device off
class TurnOffCommand implements Command {
    private Device device; //tiene al receiver como atributo

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() { //Ocupa un método del receiver dentro del metodo del command a sobrescribir
        device.turnOff();
    }
}

// Concrete command for adjusting the volume of a stereo
class AdjustVolumeCommand implements Command {
    private Stereo stereo; //tiene al concrete receiver como atributo

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();//Ocupa un método del concrete receiver (el método que no es el metodo a implementar del receiver) dentro del metodo del command a sobrescribir
    }
}

// Concrete command for changing the channel of a TV
class ChangeChannelCommand implements Command {
    private TV tv; //tiene al concrete receiver como atributo

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel(); //Ocupa un método del concrete receiver (el método que no es el metodo a implementar del receiver) dentro del metodo del command a sobrescribir
    }
}

// Receiver interface
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete receiver for a TV (notar q podemos seguir agregando receivers y el Inkoker nunca cambiará), con lo que se tiene independencia en el sender (cliente o invoker)
class TV implements Device {


    @Override
    public void turnOn() {
        System.out.println("TV is now on");
    }

    //Notar q turnOff() es el inverso de turnOn(). "The pattern supports undoable(action or a series of actions that can be reversed or undone in a system) operations by storing the state or reverse commands."
    @Override
    public void turnOff() {
        System.out.println("TV is now off");
    }

    public void changeChannel() {
        System.out.println("Channel changed");
    }
}

// Concrete receiver for a stereo
class Stereo implements Device {
    @Override
    public void turnOn() {
        System.out.println("Stereo is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is now off");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}

// Invoker (el cliente en este patron es llamado Invoker o Sender) y simplemente ejecuta el command
class RemoteControl {
    private Command command; //El Invoker tiene al command como atributo

    public void setCommand(Command command) { //notar que este no es ell constructor del invoker, sino un setter
        this.command = command;
    }

    public void pressButton() {
        command.execute(); //notar que en esta clase el invoker no tiene idea (no tiene contexto) que es lo que esta ejecutándose y command.execute() puede ser cualquiera de los execute() implementados en los Condrete Commands.
        //y con esto se logra esto: "...., allowing for the separation of sender and receiver."
    }
}

// Example usage
public class CommandPatternExample {
    public static void main(String[] args) {
        // Create devices (estos son concrete receivers)
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects (Creamos por polimorfismo los objetos de los concrete commands que en el fondo serán los requests que serán pasados del sender al receiver)
        Command turnOnTVCommand = new TurnOnCommand(tv); //Entiendo yo que la linea "Commands can be parameterized..." se refiere a esto
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        Command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control (instanciamos el invoker o sender)
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        //acá es donde el Sender o Invoker le pasa el objeto request a los concrete receivers
        remote.setCommand(turnOnTVCommand); //esto es para que el invoker (remote) finalmente tenga el contexto que faltaba acerca de qué concrete command es el que se esta ejecutando
        remote.pressButton(); // Outputs: TV is now on                 //esta linea es para q se ejecute el execute del concrete command que seteamos en la linea anterior

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}
