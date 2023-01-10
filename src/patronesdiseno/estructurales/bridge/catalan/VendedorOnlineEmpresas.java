package patronesdiseno.estructurales.bridge.catalan;

public interface VendedorOnlineEmpresas extends VendedorOnline { //refined abstraction

    void compraProducto (String nombre, int cantidadPorCaja, int cajas);

}
