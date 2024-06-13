package patronesdiseno.estructurales.bridge.catalan;

/**
 * Bridge entre las dos interfaces: VendedorOnlineEmpresas (y su supertipo VendedorOnline) y TiendaImpl
 */
public class VendedorEmpresasImpl implements VendedorOnlineEmpresas {

    private TiendaImpl impl; //este el el bridge, ya q usa por composicion el implementor en la refined abstraction (o en este caso en una clase que hereda de la refinedabstraction VendedorOnlineEmpresas)


    public VendedorEmpresasImpl(TiendaImpl impl) {
        this.impl = impl;
    }

    /**
     * Caso sencillo donde el metodo ya existe en la API de implementacion
     */
    @Override
    public String descripcionProducto(String producto) { //notar que descripcionProducto esta tanto en la abstraction (VendedorOnline) como en el implementor (TiendaImpl)
        return impl.descripcionProducto(producto);
    }


    /**
     * Caso "complejo" donde se tiene que adaptar a la diferencia entre las dos APIs
     *
     * El hecho de que la adaptacion se haga en esta clase, libera a todas las implementaciones
     * de TiendaImpl de tener que hacer esta misma adaptacion.
     */
    @Override
    public void compraProducto(String nombre, int cantidadPorCaja, int cajas) { //notar q compraProducto no esta en la abstraction (VendedorOnline), solo esta en el implementor (TiendaImpl)

        for (int i = 0; i < cajas; i++) {
            impl.compraCaja(nombre, cantidadPorCaja);
        }

    }

}
