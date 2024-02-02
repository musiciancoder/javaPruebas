package herencia.palabradefault;

public interface miinterface {

    void methodOne();
    default void methodTwo(){ //If never overriden, this is default behaviour.
        System.out.println("Im methodTwo");
    }
    default void methodThree(){
        System.out.println("Im methodThree"); //If never overriden, this is default behaviour.
    }
}
