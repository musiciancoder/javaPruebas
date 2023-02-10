package ejercicios;

public class ArrayX {

    public static void main(String[] args) {


        int dimension = 20;
        String[][] myArr = new String[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    myArr[i][j] = "x";
                } else if (i==dimension-1-j) {
                    myArr[i][j] = "x";
                } else
                    myArr[i][j] = " ";
                System.out.print(myArr[i][j] + " ");
            }

        }

    }
}