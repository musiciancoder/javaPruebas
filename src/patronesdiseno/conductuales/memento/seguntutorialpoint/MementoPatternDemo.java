package patronesdiseno.conductuales.memento.seguntutorialpoint;

/*

https://www.tutorialspoint.com/design_pattern/memento_pattern.htm
Memento pattern is used to restore state of an object to a previous state. Memento pattern falls under behavioral pattern category.

Implementation
Memento pattern uses three actor classes.
Memento contains state of an object to be restored.
Originator creates and stores states in Memento objects and
Caretaker object is responsible to restore object state from Memento. We have created classes Memento, Originator and CareTaker.

MementoPatternDemo, our demo class, will use CareTaker and Originator objects to show restoration of object states.

Tutorialpoint no menciona nada acerca de encapsulacion, lo que en cierta forma lo hace mas simple de entender
 */

public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}