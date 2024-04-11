package ejercicios;

public class SoloConsonantes {

    public static void main(String[] args) {
        String str = "zero";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!='a' && str.charAt(i)!='e' &&str.charAt(i)!='i' &&str.charAt(i)!='o' &&str.charAt(i)!='u' ){
                builder.append(str.charAt(i));
            }

        }
        System.out.println(builder);
    }
}
