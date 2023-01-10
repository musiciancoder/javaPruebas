package patronesdiseno.creacionales.factory.mito;

public class ConecionVacia implements IConexionBD {
    @Override
    public void conectar() {
        System.out.println("No se especifico proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especifico proveedor");

    }
}
