package patronesdiseno.creacionales.singleton.lazysingleton;

/*
This is the "classic" singleton pattern implementation and it uses double locking and volatile first
 */
public class LazyRegistryWithDCL { //ejemplo para programación concurrente

    private LazyRegistryWithDCL() {

    }

    private static volatile LazyRegistryWithDCL INSTANCE;

    public   static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class){ //first thread enters this line, second thread waits in this line
               if (INSTANCE == null) {
                   INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }

}
