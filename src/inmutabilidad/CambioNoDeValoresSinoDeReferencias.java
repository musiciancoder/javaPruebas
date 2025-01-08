package inmutabilidad;

public class CambioNoDeValoresSinoDeReferencias {

    public static void main(String[] args) {
        String str1 = "lala";
        String str2 = "lele";
        System.out.println("hashcode str1: " + str1.hashCode() + ", hashcode str2: " + str2.hashCode());
        str2 = str1;
        System.out.println("hashcode str1: " + str1.hashCode() + ", hashcode str2: " + str2.hashCode());

      StringBuilder builder1= new StringBuilder("lulu");
      StringBuilder builder2= new StringBuilder("lilii");
      System.out.println("hashcode builder1: " + builder1.hashCode() + ", hashcode builder2: " + builder2.hashCode());
      builder2 = builder1;
      System.out.println("hashcode builder1: " + builder1.hashCode() + ", hashcode builder2: " + builder2.hashCode());



    }
}
