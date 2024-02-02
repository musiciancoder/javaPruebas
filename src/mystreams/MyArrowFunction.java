package mystreams;

interface StringFunction {
    String run(String str);
}

public class MyArrowFunction {

    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!"; //notar que siempre se instaciar la interfaz funcional para que la funcion flecha funcione
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
    }


