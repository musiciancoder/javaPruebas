package ejercicios;

public class PiramidePalabras1 {

    public static void main(String[] args) {
        String str = "palabra";
        String [] arrStr = str.split("");
        String s, p, u="";
        for (int i = 0; i < arrStr.length; i++) {
            p=u;
            s= arrStr[i];
            u =p + s;
            System.out.println(u);
        }
        for (int i = arrStr.length-1; i >0 ; i--) {
        String str2=str.substring(0, i);;
            System.out.println(str2);
        }
    }
}
