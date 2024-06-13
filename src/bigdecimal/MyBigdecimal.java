package bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;


public class MyBigdecimal {

    /**
     * @param args
     */
    public static void main(String[] args) {


      BigDecimal bd=  new BigDecimal("7.5666789534");
      bd= bd.setScale(2, RoundingMode.CEILING);
      System.out.println(bd);

        System.out.println("Subtrai");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

        System.out.println("");
        System.out.println("Soma");
        System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

        System.out.println("");
        System.out.println("Compara");
        System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3"))>7.2);

        System.out.println("");
        System.out.println("Divide");
        System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

        System.out.println("");
        System.out.println("Máximo");
        System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

        System.out.println("");
        System.out.println("Mínimo");
        System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

        System.out.println("");
        System.out.println("Potência");
        System.out.println(new BigDecimal("2.00").pow(2));

        System.out.println("");
        System.out.println("Multiplica");
        System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

        //obteber partes entera y decimal de un numero
      double doubleNumber = 24.04; //este es el numero
      BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
      int intValue = bigDecimal.intValue();
      System.out.println("Double Number: " + bigDecimal.toPlainString());
      System.out.println("Integer Part: " + intValue);
      System.out.println("Decimal Part: " + bigDecimal.subtract(
              new BigDecimal(intValue)).toPlainString());

    }

}