package patronesdiseno.conductuales.state.tutorialpoint;

/*
TUTORIALPOINT DICE:
In State pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.

In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

Implementation
We are going to create a State interface defining an action and concrete state classes implementing the State interface. Context is a class which carries a State.

StatePatternDemo, our demo class, will use Context and state objects to demonstrate change in Context behavior based on type of state it is in.


-----------------
BAELDUNG DICE:
The main idea of State pattern is to allow the object for changing its behavior without changing its class. Also, by implementing it, the code should remain cleaner without many if/else statements.

Imagine we have a package which is sent to a post office, the package itself can be ordered, then delivered to a post office and finally received by a client. Now, depending on the actual state, we want to print its delivery status.

The simplest approach would be to add some boolean flags and apply simple if/else statements within each of our methods in the class. That won't complicate it much in a simple scenario. However, it might complicate and pollute our code when we'll get more states to process which will result in even more if/else statements.

Besides, all logic for each of the states would be spread across all methods. Now, this is where the State pattern might be considered to use. Thanks to the State design pattern, we can encapsulate the logic in dedicated classes, apply the Single Responsibility Principle and Open/Closed Principle, have cleaner and more maintainable code.

Downsizes: State pattern drawback is the payoff when implementing transition between the states. That makes the state hardcoded, which is a bad practice in general.
But, depending on our needs and requirements, that might or might not be an issue.

* */

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context(); //con constructor inicializando estado nulo en clase Context
        //Context context = new Context(null); //sin constructor inicializando estado nulo en clase Context

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}