package patronesdiseno.conductuales.template.tutorialpoint;


//Create an abstract class with a template method being final.
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method. Notar que los metodos son una secuencia de eventos que se realizan uno tras otro
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}