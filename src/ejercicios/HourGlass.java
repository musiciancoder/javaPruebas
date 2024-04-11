package ejercicios;

import java.util.Scanner;

public class HourGlass { //de Hacherrrank
    /* Ejemplo de hourglass:
    101
     1
    210
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int [6][6];

        for (int i = 0; i < 6; i++) {
            String [] arrRowItems = scanner.nextLine().split(" "); //pasar los numeros con espacio en el scanner
           // scanner.skip("(\r\n|)")

                    for(int j =0; j<6; j++){
                        int arrItem = Integer.parseInt(arrRowItems[j]);
                        arr[i][j] = arrItem;
                    }
        }
scanner.close();;

int max_hourglass_sum = -63;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int current_sum = arr[i][j] +arr[i][j+1] +arr[i][j+2] +arr[i+2][j] +arr[i+2][j+1] +arr[i+2][j+2];
if (current_sum>max_hourglass_sum){
    max_hourglass_sum = current_sum;
}
            }
        }

        System.out.println(max_hourglass_sum);

    }


}
