package ejercicios;

public class ArrayRedondo {

    public static void main(String[] args) {


        double dimension = 21;
        double radio =(dimension-1)/2;
        int dim = ((int) dimension);
        System.out.println(dim);
        String[][] myArr = new String[dim][dim];
        double distancia;
        String centro = myArr[(int) (dimension / 2)][(int) (dimension / 2)];

        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++) {
                distancia = 21-1/2;
                if (distancia==radio){
                    myArr[i][j]="x";

                }
                else myArr[i][j]="o";

                System.out.print(myArr[i][j]+" ");

            }

        }


        //  System.out.println(Arrays.deepToString(myArr));

        System.out.println();


        System.out.println((myArr.length));




    }
}
