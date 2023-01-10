package patronesdiseno.creacionales.abstractfactory;

public class AsusMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembled ASUS Monitor");//notar q esto NO se imprime
    }
}
