package ejercicios;

import java.util.Arrays;

public class Indices {
    public static void main(String[] args) {
        int [][] myint = new int [2][3];
        myint[0][0]=1;
        myint[0][1]=2;
        myint[0][2]=3;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myint[i][j]);
            }
            System.out.println();
        }
    }
}
