package patronesdiseno.conductuales.strategy.tutorialpoint;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){ //espera una interfaz Strategy por parametro, pero se le pasan clases concretas (polimorgismo)
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }


}
