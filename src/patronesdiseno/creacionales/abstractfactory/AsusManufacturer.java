package patronesdiseno.creacionales.abstractfactory;

public class AsusManufacturer extends Company{ //esta es una fabrica
    @Override
    public Gpu createGpu() {
        System.out.println("Created GPU"); //notar q esto se imprime
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Created Monitor");

        return new AsusMonitor();
    }
}
