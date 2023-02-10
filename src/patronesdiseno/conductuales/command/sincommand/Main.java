package patronesdiseno.conductuales.command.sincommand;

public class Main {

    public static void main(String[] args) {

        //having an enormous number of subclasses (una mansion puede tener muchas piezas, por ejemplo) increases the risk of breaking the code in any subclass everytime we modify the parent class.
        //supongamos q el dueño de casa adquiere sensores automaticos para el baño, por lo que ya no ocupa el switch para los baños. El programa como está no le permite implementar esto, porque el método
        //switchLights() está en la clase padre Room. Este ejemplo es valido para cualquier tipo de business logic, no solo para switchedLights();
//Ademas notar q como FloorLamp no es un Room, no podemos extender de room, por lo nos vemos obligados a duplicar el codigo del metodo switchLights()
        House house = new House ();
        house.addRoom(new LivingRoom(new Light()));
      /* Estas clases serían igual a LivingRoom, me dio lata escribirlas
       house.addRoom(new Bathroom());
        house.addRoom(new Kitchen());
        house.addRoom(new Bedroom());
        house.addRoom(new Bedroom());*/
    }


}
