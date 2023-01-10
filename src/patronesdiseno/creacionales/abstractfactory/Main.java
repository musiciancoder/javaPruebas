package patronesdiseno.creacionales.abstractfactory;

public class Main {
    public static void main(String[] args) {

        //Notar q los tipos de los objetos nunca es Company, o sea unca es del tipo la Fabrica abstracta

        Company msi = new MsiManufacturer();
        System.out.println("msi: " +msi.getClass());
        Gpu msiGpu = msi.createGpu();
        System.out.println("msiGpu: " +msiGpu.getClass());
        Monitor msiMonitor= msi.createMonitor();
        System.out.println("msiMonitor: " + msiMonitor.getClass());

        Company asus = new AsusManufacturer();
        System.out.println("asus: " +asus.getClass());
        Gpu asusGpu = asus.createGpu();
        System.out.println("asusGpu: " +asusGpu.getClass());
        Monitor asusMonitor = asus.createMonitor();
        System.out.println("asusMonitor: " +asusMonitor.getClass());

    }
}
