package primitivesandwrappers;

public class MyDouble {

    public static void main(String[] args) {
        double  num0 = 1.23456; //resultado 1.23456
        System.out.println(num0);

       double  num1 = 2.345;
        System.out.println("Double Number: " + String.format("%.2f", num1)); //resultado Double Number: 2,35

        double  num2 = 3.467;
        int int2 = (int) num2;
        System.out.println(int2); //resultado 3
    }

}
