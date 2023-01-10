package patronesdiseno.creacionales.abstractfactory;

public abstract class Company {//This is the abstract factory, which is a "factory of factories"

    //business logic can be added here

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
