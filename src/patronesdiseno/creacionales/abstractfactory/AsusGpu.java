package patronesdiseno.creacionales.abstractfactory;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembled ASUS GPU");//notar q esto NO se imprime

    }
}
