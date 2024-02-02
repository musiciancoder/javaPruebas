package designpatternbaeldung.bridge;

public abstract class Shape { //Entiendo yo que esta sería la "implementation" del readme. "Abstraction" no es sinonimo de clase abstracta sino de un modulo que hereda de otro.
    protected Color color; //Este es el bridge!!

    public Shape(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }

    abstract public String draw();
}