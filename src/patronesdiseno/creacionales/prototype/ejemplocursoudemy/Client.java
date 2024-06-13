package patronesdiseno.creacionales.prototype.ejemplocursoudemy;

/*
-Think of prototypepattern when you hava an object where construction of a new instance is costly or not possible (object is supplied to your code).
-In Java we typically immplement this pattern with clone method
-Objects which have a majoritu of their state as immutable are good candidates for prototypes.
-When implementing clone method pay attention to the requirement od deeo or shallow copy of object state,
-Also we've to insure that clone is "initialized", that appropiate states are reset before returning the copy to outside world
 */

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();

        
        System.out.println(s1);
        Swordsman s2 = (Swordsman)s1.clone();
        System.out.println("Cloned swordsman"+s2); //notar q s2 va a estar en estado inicial, a diferencia de s1 q esta atacando
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

            System.out.println(s1==s2); //false, porque las copias apuntan a diferentes locaciones en memoria
            System.out.println(s1.equals(s2)); //falso porque no hemos sobrescrito equals

	}

}
