package algoritmos.searchingarrays;

import java.util.Arrays;

/*
// si el numero buscado es mayor que el numero de la mitad del array ordenado, el numero que sigue despues de la mitad del array pasa
a ser el low y en la proxima iteracion se busca en el array desde em mediio para adelante
En el mejor de los casos (lo encuentra en la primera iteracion) el resultado es de orden lineal uno O(1), al igua q en LinearSearch
En el PEOR de los casos (lo encuentra en varias iteraciones cercanas al numero de elementos del array) el resultado es de orden logaritmico O(log(n)) (curva chata), lo q es mejor que en LinearSearch cuando tenemos un tiempo que es de orden O(n)
 */

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 100, 200, 10, 20, 30, 40, 70, 90 };
        Arrays.sort(a); //si no estan ordenados no funciona, obviamente
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int index = recursiveBinarySearch(a, 20, 0, a.length - 1);

        if (index == -1) {
            System.out.println(" Element not found");
        } else {
            System.out.println(" Element found at index: " + index);
        }
    }

    private static int binarySearch(int[] a, int num, int low, int high) {
        while (low <= high) {
            int mid = (high + low) / 2;

            if (a[mid] == num) { //num es el numero encontrado
                return mid;
            }

            if (a[mid] < num) { // si el numero buscado es mayor que el numero de la mitad del array ordenado, el numero que sigue despues de la mitad del array pasa a ser el low y en la proxima iteracion se busca en el array desde em mediio para adelante
                low = mid + 1;
            } else {
                high = mid - 1;//// si el numero buscado es menor que el numero de la mitad del array ordenado, el numero que esta antes de la mitad del array pasa a ser el high y en la proxima iteracion se busca en el array desde em mediio para abajo
            }
        }

        return -1;
    }

    private static int recursiveBinarySearch(int[] a, int num, int low, int high) {
        if (high >= low) {
            int mid = (high + low) / 2;

            if (a[mid] == num) {
                return mid;
            }

            if (a[mid] > num) {
                return recursiveBinarySearch(a, num, low, mid - 1);
            }

            return recursiveBinarySearch(a, num, mid + 1, high);
        }

        return -1;
    }

}