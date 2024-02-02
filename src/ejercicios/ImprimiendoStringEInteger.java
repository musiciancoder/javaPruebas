package ejercicios;

public class ImprimiendoStringEInteger {
   static String str1= "Esta es mi edad: ";
   static  int i1 = 46;
    static  int i2 = 47;

    public static void main(String[] args) {
        System.out.println(str1);
        System.out.println(i1);
        System.out.println(str1 + i1);
        System.out.println(i1 + str1);
        System.out.println(i1+i2);
        System.out.println(i1+i2+str1);
        System.out.println(str1 + i1 + i2);
    }

}
