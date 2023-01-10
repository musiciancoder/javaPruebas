package patronesdiseno.estructurales.bridge.catalan;

 /* Implementation API : captura lo que tienen en comun todas las implementaciones existentes
         */
public interface TiendaImpl { //este es el implementor

    public String descripcionProducto(String producto);

    void compraProducto (String nombre, int cantidad);

    void compraCaja (String nombre, int numeroProductosEnCaja);
}
