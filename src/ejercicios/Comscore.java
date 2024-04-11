package ejercicios;


import java.util.Scanner;

public class Comscore {

  static  Scanner scanner = new Scanner(System.in);
  static String str;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        str = scanner.nextLine();
        boolean numeroNegativo=false;
        if (str.startsWith("-")){
            str = str.substring(1);
           numeroNegativo=true;
        }


        String [] arr = new String[str.length()];
        arr = str.split("");
        int numeroMayor = -8001, numeroActual, numeroMenor=8001;


        for (int i = 0; i < arr.length + 1; i++) {
            //5676
            String str2 =  insertaNumero(arr,i);
            numeroActual = Integer.parseInt(str2);

            if(numeroNegativo==false) {
                if (numeroActual > numeroMayor) {
                    numeroMayor = numeroActual;
                }
            } else {
                if (numeroActual<numeroMenor){
                    numeroMenor = numeroActual;
                }
            }



        }

        if (numeroNegativo==false) {
            System.out.println("El maximo valor posible es: " + numeroMayor);
        } else {
            System.out.println("El maximo valor posible es: " + "-" + numeroMenor);
        }
        //pcucurullo@comscore.com



    }

    public static String insertaNumero(String [] arr,int position){
        String [] arr2 = new String[str.length()+1];
        boolean flag =false;
        for (int j = 0; j < arr2.length; j++) {
            if (j==position){
                arr2[j]="5";
                flag =true;
            }else {
                if (flag==false){
                    arr2[j]=arr[j];
                }else {

                    arr2[j]=arr[j-1];
                }
            }
        }
        String joined = String.join("", arr2);
        return joined;


    }

  //insertaNumero(arr,pos,5)  -->devuelve entero //8,4,-1

    /*
    ADD 5Write a function solution that, given an integer N, returns the maximum possible value obtained by inserting one '5' digit inside the integer N.
Examples:
1. Given N = 268, the function should return 5268.
2. Given N = 670, the function should return 6750.
3. Given N = 0, the function should return 50.
4. Given N = −999, the function should return −5999.
Assume that:
N is an integer within the range [−8,000..8,000].
     */

}
