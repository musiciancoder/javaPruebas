package ejercicios;

public class PalabraCorrida {
    public static void main(String[] args) {
        String str = "hola";
        System.out.println(str);
        StringBuilder builderStr = new StringBuilder(str);

        for (int h = 0; h < builderStr.length(); h++) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i + 1 == str.length()) break;
                builder.append(builderStr.charAt(i + 1));
            }
            builder.append(str.charAt(h));
            if (!builder.toString().equals(str)){ System.out.println(builder);}
            builderStr=builder;


        }

    }
}
