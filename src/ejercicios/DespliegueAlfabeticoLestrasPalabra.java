package ejercicios;

public class DespliegueAlfabeticoLestrasPalabra {
    public static void main(String[] args) {
        String palabra = "mito";
        char letra;
      //  StringBuilder abecedario = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
       String abc = new String("abcdefghijklmnopqrstuvwxyz");
        char [] array = new char[26];
        for (int i = 0; i < array.length; i++) {
           array[i]= abc.charAt(i);
        }

        for (int i = 0; i < palabra.length(); i++) {
            letra=palabra.charAt(i);
            for (int j = 0; j < array.length; j++) {

                if (array[j]==letra){
                    for (int k = 0; k <= j; k++) {
                        System.out.print(array[k]);
                    }
                }
            }

            System.out.println();


        }
    }
}
