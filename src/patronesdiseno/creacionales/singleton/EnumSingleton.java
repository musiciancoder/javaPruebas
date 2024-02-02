package patronesdiseno.creacionales.singleton;

//https://www.baeldung.com/java-singleton

 //uso de enum para generar instancia singleton
/*
This approach has serialization and thread-safety guaranteed by the enum implementation itself, which ensures
internally that only the single instance is available, correcting the problems pointed out in the class-based implementation
 */
 public enum EnumSingleton {

     INSTANCE("Initial class info");

     private String info;

     private EnumSingleton(String info) { //notar q el constructor es privado ya que estamos usando enum y no class!!
         this.info = info;
     }

     public EnumSingleton getInstance() { //getter para la instancia. Esto no es obligatorio en un enum comun y corriente, pero sí lo es para crear un patrón singleton mediante enum.
         return INSTANCE;
     }

     public String getInfo() {
         return info;
     }

     public void setInfo(String info) {
         this.info = info;
     }
 }
