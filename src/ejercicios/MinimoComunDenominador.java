package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinimoComunDenominador {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
       String str= br.readLine();
       String [] arr = str.split(" ");
       int [] arrNum = new int[arr.length];
       int c=0;
        for (String s:arr
             ) {
            int p = Integer.parseInt(s);
            arrNum[c] =p;
            c++;
        }

        for (int i = 0; i < arrNum.length; i=i+3) {
            int x = arrNum[i];
            int y = arrNum[i+1];
            int z = arrNum[i+2];
            int mcd;
            if(y%x==0 && z%x==0){
                mcd=x;
            } else if (x%y==0 && z%y==0) {
                mcd=y;
            } else if (x%z==0 && y%z==0) {
                mcd=z;
            } else {
                mcd = x*y*z;
            }
            System.out.println(mcd);
        }

}
}
