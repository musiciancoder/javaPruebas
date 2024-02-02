package patronesdiseno.conductuales.template.tutorialpoint;

public class TemplatePatternDemo {

    //Esta clase no es un cliente, sino es solo para demostrar como funciona el pattern
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        //Cricket Game Initialized! Start playing.
        //Cricket Game Started. Enjoy the game!
        //Cricket Game Finished!
        game = new Football();
        game.play();
        //Football Game Initialized! Start playing.
        //Football Game Started. Enjoy the game!
        //Football Game Finished!
    }
}
