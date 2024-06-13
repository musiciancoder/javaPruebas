package constructors;

/*
Se usan atributos static sin final si queremos dar un valor inicial en la clase, no en el constructor. En el constructor jamás tendremos acceso a pasar un valor, pero sí podremos cambiarlo por setter.
 */

public class AtributosStatic {
    private static String name;

    public AtributosStatic() { //notar q esta disponible solo constructor vacio en el IDE, y uno despues inicializa la variable, que como no es final se puede modificar igual despues por medio de un setter
    name = "Andresito";


    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        AtributosStatic.name = name;
    }
}


 class AtributosStatic2 {
     private static String name2;
     private String adress;

     public AtributosStatic2(String adress) {
         this.adress = adress;
         name2 = "Jessica";
     }

     public String getName2() {
         return name2;
     }

     public void setName2(String name2) {
         AtributosStatic2.name2 = name2;
     }

     public String getAdress() {
         return adress;
     }

     public void setAdress(String adress) {
         this.adress = adress;
     }
 }

 class MainClass {
     public static void main(String[] args) {
         AtributosStatic atributosStatic = new AtributosStatic();
         System.out.println(atributosStatic.getName());
         atributosStatic.setName("Hernan"); //se puede cambiar lo mas bien
         System.out.println(atributosStatic.getName());

         AtributosStatic2 atributosStatic2 = new AtributosStatic2("Pudeto 270");
         System.out.println(atributosStatic2.getName2());
         System.out.println(atributosStatic2.getAdress());
     }
 }
