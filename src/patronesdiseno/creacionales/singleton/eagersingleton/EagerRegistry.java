package patronesdiseno.creacionales.singleton.eagersingleton;


/*
Eager Singleton is for when the singleton is created as soon as the class is loaded and is always available.
 Early/Eager initialization is the simplest & prederred way. Always try to use this approach first.
 */
public class EagerRegistry {

    private EagerRegistry(){ //private constructor so that objects from this class cannot be created by using the constructor, This also prevents inheritance
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry(); //private so that only members form the class can access to the variable

    public static EagerRegistry getInstance() { //public and static so we can call EagerRegistry.getInstance() from outside the class

        return INSTANCE;
    }
}
