package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            double suma = 0;
int sumaint;
            List<Integer> lista;
            List<List> listaDos = new ArrayList<>();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                lista = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if(j==0){
                        suma = 0;
                        suma = suma + (a + Math.pow(2, j)*b);
                        sumaint = (int) suma;
                        lista.add(sumaint);
                    }else{
                        suma = suma + (Math.pow(2, j)*b);
                        sumaint = (int) suma;
                        lista.add(sumaint);
                    }
                }
           listaDos.add(lista);
            }
            in.close();

            //

        for (List<Integer> l1 : listaDos) {
            for (Integer n : l1) {
             String str =   String.valueOf(n);
                System.out.print(str + " ");
            }

            System.out.println();
        }
        //
        }
    }

