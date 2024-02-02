package ejercicios;

public class StringReverser {

    public static String reverse0(String str){
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }

    public static String reverse(String input){
        String result="";
        for (int i = input.length() -1; i >=0 ; i--) {
            result = result + input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringReverser.reverse("bharath"));
        System.out.println(reverse0("andres"));
    }

}
