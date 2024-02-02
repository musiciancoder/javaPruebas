package patronesdiseno.solid.liskovsubstitution.good;

public class Main {
    public static void main(String[] args) {
        System.out.println("Good!");
        LittleMammal chiquita = new Cat("Chiquita","black",false,false,true);
        System.out.println(chiquita.getName() + " " + chiquita.jump());
        Mammal elephant = new Elephant("Dumbo","grey",true,true);
        System.out.println(elephant.getName()+" is "+elephant.getColor());
    }
}
