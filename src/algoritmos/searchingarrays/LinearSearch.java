package algoritmos.searchingarrays;

public class LinearSearch { //tambien llamado Sequential Search

    /*
    Siempre será linear time complexity.
    Sin embargo, si buscamos el numero 20, el n sera igual a 2 (no a seis que es el numero de elementos), demorandose menos que si buscaramos 70 donde el n sera igual a 5.
    El time complexity es O(2) y O(5) respectivamente, no es que varíe la pendiente de la recta ya que esto último depende de las caracteristicas del algoritmo.
     */

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 70, 90 };
        int index = linearSearch(a, 70);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    private static int linearSearch(int[] a, int num) {

        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                return i;
            }
        }

        return -1;

    }
}
