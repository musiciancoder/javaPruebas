package nulo;


import static constants.MyConstants.ConstantPublic;
//import static constants.MyConstants.ConstantPrivate; Notar que no se pueden importar. Las constantes son siempre publicas!!!

public class TestConstants {

    public static void main(String[] args) {
        String declaradoPeroNoInicializadoComoNull=null;
        System.out.println(declaradoPeroNoInicializadoComoNull);
      //  System.out.println("declaradoPeroNoInicializado: " + declaradoPeroNoInicializado);
      //  System.out.println(nideclaradoPeroNoInicializado);
        System.out.println(ConstantPublic);
        if (declaradoPeroNoInicializadoComoNull=="lala"){
            System.out.println(declaradoPeroNoInicializadoComoNull);
        }else {
            System.out.println(declaradoPeroNoInicializadoComoNull);
        }

       // System.out.println(ConstantPrivate);
    }
}


