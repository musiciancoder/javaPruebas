package collectionsamigoscode;

/*
-Can contains copies (clones) but cannot an object that is equal to another object (same hashcode)
-More formally sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element.
-As implied by its name, this interface models the mathematical set abstraction
-It is like a bag of unsorted elements, so there is no head nor tail
 */


import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        System.out.println(balls.size()); //3, which means it does not take on equal objects (sigue marcando 4 porque el fucking IDE no me ayuda a sobreescribir los metodos equals y hashcode correctamente, me los tira con la mierda de super.
        balls.forEach(System.out::println);
        balls.forEach(e-> System.out.println(e.hashCode()));
    }
}

class Ball {
    //If we do not override we get clones instead of equal objects


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color:" + this.getColor() ;
    }





}
