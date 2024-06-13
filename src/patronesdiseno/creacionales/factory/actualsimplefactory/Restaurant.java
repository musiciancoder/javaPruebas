package patronesdiseno.creacionales.factory.actualsimplefactory;

public abstract class Restaurant { //Este es el Factory (tambien llamado Creator). A veces el Factory lo colocan como Interfaz tambien, no necesariamente clase abstracta

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();  //este método abstracto que deberá ser implementado por
    //cada tipo de restaurant; libera al restaurant de depender de parámetros, con lo que conseguimos el patrón de simple factory verdadero.
}
