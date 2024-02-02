package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumerosRelleno {

    public static void main(String[] args) {
        int num = 1492;
        String str = String.valueOf(num);
        String[] arrStr = (str.split(""));
        int [] numArr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            numArr[i] = Integer.parseInt(arrStr[i]);
        }
        int a;
        int b;
        int c;

        int counter;

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(" ");
                counter = 0;
                a = numArr[i];
                if (i+1==numArr.length){break;}
                b = numArr[i + 1];
                c=a;
                while (b - a > 0) {
                    a = a + counter;
                    counter++;
                    c++;
                    System.out.print(c);
                }

            }






        }

    }

