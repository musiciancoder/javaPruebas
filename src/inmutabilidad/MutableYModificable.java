package inmutabilidad;

public class MutableYModificable {

    public static void main(String[] args) {

        System.out.println("--------------------------OBJETOS INMUTABLES--------------------------------"); //En objetos inmutables si se modifica el valor, se modifica tambien su hashcode

        System.out.println(" ");

        //Cambio de valor
        //Los resultados muestran hashcode diferentes, lo que demuestra que el valor de str1 no se muede modificar para el mismo hashcode, y que si se modifica va a tener otro hashcode, por lo q no va a ser el mismo objeto
        String str1 = "lala";
        System.out.println("str1 antes del cambio: " + str1 + ", hashcode str1 antes del cambio: " + str1.hashCode());
         str1 = "lele";
        System.out.println("str1 despues del cambio: " + str1 + ", hashcode str1 despues del cambio: " + str1.hashCode());


        System.out.println(" ");

        //La referencia de un String cambia a la referencia de otro String
        //Los resultados muestran q hay cambio de valor y ademas str3 toma el hashcode de str2
        String str2= "lili";
        System.out.println("str2 antes del cambio: " + str2 + ", hashcode str2 antes del cambio: " + str2.hashCode());
        String str3 = "lolo";
        System.out.println("str3 antes del cambio: " + str3 + ", hashcode str3 antes del cambio: " + str3.hashCode());
        str3 = str2;
        System.out.println("str2 despues del cambio: " + str2 + ", hashcode str2 despues del cambio: " + str2.hashCode());
        System.out.println("str3 despues del cambio: " + str3 + ", hashcode str3 despues del cambio: " + str3.hashCode());


        System.out.println(" ");

        //El valor de un String cambia a un valor que pertenece a otro String
        //Los resultados muestran q hay cambio de valor y ademas str5 toma el hashcode de str4
        String str4 = "lulu";
        System.out.println("str4 antes del cambio: " + str4 + ", hashcode str4 antes del cambio: " + str4.hashCode());
        String str5 = "lzlz";
        System.out.println("str5 antes del cambio: " + str5 + ", hashcode str5 antes del cambio: " + str5.hashCode());
        str5 = "lulu";
        System.out.println("str4 despues del cambio: " + str4 + ", hashcode str4 despues del cambio: " + str4.hashCode());
        System.out.println("str5 despues del cambio: " + str5 + ", hashcode str5 despues del cambio: " + str5.hashCode());

        System.out.println(" ");

        System.out.println("--------------------------OBJETOS MUTABLES--------------------------------"); //En objetos

        System.out.println(" ");

        //Cambio de valor
        //Los resultados muestran hashcode diferentes, lo q es obvio ya que estamos ocupando la palabra reservada "new"
        StringBuilder sb1 = new StringBuilder("lala");
        System.out.println("sb1 antes del cambio: " + sb1 + ", hashcode sb1 antes del cambio: " + sb1.hashCode());
        sb1 = new StringBuilder("lele");
        System.out.println("sb1 despues del cambio: " + sb1 + ", hashcode sb1 despues del cambio: " + sb1.hashCode());


        System.out.println(" ");

        //La referencia de un StringBuilder cambia a la referencia de otro StringBuilder
        //Los resultados muestran q hay cambio de valor y ademas sb3 toma el hashcode de sb2
        StringBuilder sb2= new StringBuilder("lili");
        System.out.println("sb2 antes del cambio: " + sb2 + ", hashcode sb2 antes del cambio: " + sb2.hashCode());
        StringBuilder sb3= new StringBuilder("lolo");
        System.out.println("sb3 antes del cambio: " + sb3 + ", hashcode sb3 antes del cambio: " + sb3.hashCode());
        sb3 = sb2;
        System.out.println("sb2 despues del cambio: " + sb2 + ", hashcode sb2 despues del cambio: " + sb2.hashCode());
        System.out.println("sb3 despues del cambio: " + sb3 + ", hashcode sb3 despues del cambio: " + sb3.hashCode());


        System.out.println(" ");

        //El valor de un StringBuilder cambia a un valor que pertenece a otro StringBuilder
        //Los resultados muestran q hay cambio de valor y ademas sb5 toma un valor q no es ni el valor antiguo de sb5 ni el valor de sb4
        StringBuilder sb4= new StringBuilder("lulu");
        System.out.println("sb4 antes del cambio: " + sb4 + ", hashcode sb4 antes del cambio: " + sb4.hashCode());
        StringBuilder sb5= new StringBuilder("lzlz");
        System.out.println("sb5 antes del cambio: " + sb5 + ", hashcode sb5 antes del cambio: " + sb5.hashCode());
        sb5 = new StringBuilder("lulu");
        System.out.println("sb4 despues del cambio: " + sb4 + ", hashcode sb4 despues del cambio: " + sb4.hashCode());
        System.out.println("sb5 despues del cambio: " + sb5 + ", hashcode sb5 despues del cambio: " + sb5.hashCode());

    }
}
