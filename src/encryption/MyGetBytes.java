package encryption;

public class MyGetBytes {
    public static void main(String[] args) {
        //1 byte = 8 bits of memory.
        String str0 = "HolaMundo";
        byte[] myBytes= str0.getBytes(); //getBytes() encodes the string into an array of bytes.
        for (byte i: myBytes) {
            System.out.println(i);}
    }
}
