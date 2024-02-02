package patronesdiseno.conductuales.state.tutorialpoint;

public class Context {
    private State state;

    public Context(){ //constructor solo para inicializar estado como nulo
        state = null;
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}