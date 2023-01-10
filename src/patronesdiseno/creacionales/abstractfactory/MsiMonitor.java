package patronesdiseno.creacionales.abstractfactory;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembled MSI Monitor");
    }
}
