package ejercicios;

public class PiramideNumeros {

    public static void main(String[] args) {
        int n = 20;
        int counter = 0;
        int [] arrNum = new int[n];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = counter;
            counter++;
            if (counter==10){
                counter = 0;
            }
        }
counter=0;
        for (int i = 0; i < arrNum.length ; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(arrNum[counter]);
                counter ++;
            }
            counter =i;
            System.out.println(" ");
        }

    }
}
