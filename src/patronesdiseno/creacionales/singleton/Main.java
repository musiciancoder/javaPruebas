package patronesdiseno.creacionales.singleton;

public class Main {

    public static void main(String[] args) {
        EnumSingleton unicoUno= EnumSingleton.INSTANCE;
        EnumSingleton unicoDos= EnumSingleton.INSTANCE;
        if (unicoUno.hashCode()==unicoDos.hashCode()){
            System.out.println("This is a singleton pattern");
        }else {
            System.out.println("This is NOT a singleton pattern");
        }


        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info
    }
}
