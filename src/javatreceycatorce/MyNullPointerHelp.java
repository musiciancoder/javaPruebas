package javatreceycatorce;

import java.util.Arrays;

public class MyNullPointerHelp {

    public static void main(String[] args) {
        //pasamos -XX:+ShowCodeDetailsInExceptionMessages en los argumentos (running configuration MyNullPointerHelp)
        System.out.println((Arrays.toString(args)));
        String str = null;
        System.out.println(str.charAt(1));
    }
}
