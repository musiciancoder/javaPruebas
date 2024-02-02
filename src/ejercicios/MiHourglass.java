package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiHourglass {

/*    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }*/

/*    public static void main(String[] args) throws IOException {
        int[][] arr = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxHourglassSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxHourglassSum = Math.max(maxHourglassSum, hourglassSum);
            }
        }

        System.out.println(maxHourglassSum);
        scanner.close();
    }*/

    //MIO
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        //LEE
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int x = scanner.nextInt();
                 arr[i][j] = x;
            }
        }
        int suma;
        int suma_anterior=0;
        int numero_mayor=0;
        //IMPRIME
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i<4 && j < 4) {
                    int cero = arr[i][j];
                    int primero = arr[i][j + 1];
                    int segundo = arr[i][j + 2];
                    int tercero = arr[i+1][j + 1];
                    int cuarto = arr[i+2][j];
                    int quinto = arr[i+2][j + 1];
                    int sexto = arr[i+2][j + 2];
                    suma = cero + primero + segundo + tercero + cuarto + quinto + sexto;
                    if (suma > suma_anterior){
                        numero_mayor = suma;
                    } else {
                        numero_mayor = suma_anterior;
                    }
                    suma_anterior = numero_mayor;
                }
            }
        }
        System.out.println(numero_mayor);
            }

    }


