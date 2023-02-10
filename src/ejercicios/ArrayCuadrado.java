package ejercicios;

import java.util.Arrays;

public class ArrayCuadrado {


    public static void main(String[] args) {


        int dimension = 20;
        String[][] myArr = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
           System.out.println();
            for (int j = 0; j < dimension; j++) {
                if (i==0 || i== dimension -1){
                  myArr[i][j]="x";

                } else if (j==0 || j== dimension -1) {
                    myArr[i][j]="x";
                }
                else myArr[i][j]=" ";

                System.out.print(myArr[i][j]+" ");

            }

        }


     //  System.out.println(Arrays.deepToString(myArr));

        System.out.println();


        System.out.println((myArr.length));




    }
}
