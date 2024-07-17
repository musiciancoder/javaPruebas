package patronesdiseno.conductuales.memento.seguntutorialpoint;

public class Memento { //Notar que acá memento no es una clase interna como recomienda el gringo. En el ejemplo de baeldung https://www.baeldung.com/java-memento-design-pattern tampoco lo es

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}