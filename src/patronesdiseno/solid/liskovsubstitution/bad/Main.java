package patronesdiseno.solid.liskovsubstitution.bad;


public class Main {

    public static void main(String[] args) throws Exception {


        //Note this solution is AWFUL, because although subclasses (Elephant) to be used in polimorphism can implement methods Eat and Jump, when we want to call them it dont even compile,
        //If we wanted to do so we would had to implement Eat and Jump in Mammal to (still awful) or make Elephant elephant instead of Mammal elephant in line 12, but then we would not be able to proove the whole point of liskov substitution

        Mammal elephant = new Elephant("elephant","grey",true,false,true);

      //  System.out.println(elephant.getName() + " " + elephant.eating()); //does not compile

        System.out.println("Elephant or Mammal: " + elephant.getClass().getTypeName());



    }

}
