package algoritmos.sortingarrays;

public class BubbleSort {

    public static void main(String[] args) {
        //  int [] numbers = {10,1,3,4,6,8};
        int[] numbers = {25, 35, 15, 10, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.enhancedSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }


/*    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) { //dos loop for dan un cuadratic algorithm complexity time
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }*/


        //Enhancement 1.
        // Resulta que cuando tomamos la primera iteracion del primer innerloop, el numero mayor del array (35 en nuestro caso) será siempre tomado
        // desde la posición donde se encuentre hasta el final en los swaps y quedará ya al final para las siguientes iteraciones, por lo que como ya sabemos que el 35 ocupa la posicion length-1 no necesitamos
        // iterar hasta   numbers.length-1 en el inner array sino hasta  numbers.length-i

/*    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i; j++) { //dos loop for dan un cuadratic algorithm complexity time
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }


    }*/

    //Enhancement 2
    // i++; junto con for (int j = 0; j < numbers.length - i; j++)-->notar q esto hace que el loop for no tome en cuenta los elementos que ya estan ordenados (el 35 por ejemplo lo toma solo la primera vez). Con el while gerenciado por un boolean nos ahorramos el doble for.

    public void enhancedSort(int[] numbers) {
        int i =0;
        boolean swapped =true;
        while (swapped) {
            swapped = false;
            i++; //notar q esto hace que el loop for no llegue hasta el final
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

}