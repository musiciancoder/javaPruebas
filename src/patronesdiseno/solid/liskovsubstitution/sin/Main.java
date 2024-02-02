package patronesdiseno.solid.liskovsubstitution.sin;

public class Main {

   //We know from a functionality standpoint (not from compile reasons nor running reasons) that elephants cannot jump, which is why we had to throw an error so each time
    //an elephant has to jump the program will throw an exception. We achive perfect functionality by doing this, however we are violating Liskov substitution principle for the elephant,
    //and testing for this class will always fail as a result.

    public static void main(String[] args) throws Exception {
        Mammal cat = new Cat("cat","grey",false,false,true); //Here we successfully replace superclass Mammal by subclass Cat

        System.out.println(cat.getName() + " " + cat.jump());

        Mammal elephant = new Elephant("elephant","grey",true,false,true); //Here we UNSUCCESSFFULLY replace superclass Mammal by subclass Cat. Liskov violated!

        System.out.println(elephant.getName() + " " + elephant.jump());

        System.out.println("Program complete"); //crashed before reaching this line



    }
}
