package herencia.palabradefault;

public class MiClase implements miinterface{

    @Override
    public void methodOne() {
        System.out.println("Im methodOne");
    }

    @Override
    public void methodTwo() {
        miinterface.super.methodTwo();
        System.out.println("and methodTwo can be overriden");
    }
}
