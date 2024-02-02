package arrays;

public class ArrayStringAArrayInt {
    public static void main(String[] args) {
        int num = 1492;
        String str = String.valueOf(num);
        String[] arrStr = (str.split(""));
        int [] numArr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            numArr[i] = Integer.parseInt(arrStr[i]);
        }
    }
}
