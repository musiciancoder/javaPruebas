package inmutabilidad;

public class ValueChanges {

    public static void main(String[] args) {
        String str1 = "arbol";
        String str2 = str1;
        System.out.println("Before change of values: " + "str1: " + str1 + " str2: " + str2);
        str2 = "casa";
        System.out.println("After change of values: " + "str1: " + str1 + " str2: " + str2);

        String str3 = new String("arbol");
        String str4 = str3;
        System.out.println("Before change of values: " + "str3: " + str3 + " str4: " + str4);
        str4 = "casa";
        System.out.println("After change of values: " + "str3: " + str3 + " str4: " + str4);

        StringBuilder str5 = new StringBuilder("arbol");
        StringBuilder str6 = str5;
        System.out.println("Before change of values: " + "str5: " + str5 + " str6: " + str6);
     //   str6 = "casa"; This is not possible!!
        System.out.println("After change of values: " + "str5: " + str5 + " str6: " + str6);
    }
}
