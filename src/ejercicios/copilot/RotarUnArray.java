package ejercicios.copilot;

import java.util.*;

public class RotarUnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = Integer.parseInt(scanner.next());
        Integer [] arr = new Integer [n];
        for (int i = 0; i < n; i++) {
          arr[i]  = scanner.nextInt();
        }
/*       List<Integer>list= new LinkedList<>();
        list = Arrays.asList(arr);
        Collections.rotate(list,k);
        list.forEach(p-> System.out.print(p + " "));*/

        Integer [] myarr = new Integer [n];
        int c =0;
        for (int i = k; i < n; i++) {
            myarr[c] = arr[i];
            c++;
        }
        for (int i = 0; i < k; i++) {
            myarr[c] = arr[i];
            c++;
        }

        for (Integer p:
             myarr) {
            System.out.print(p+ " ");
        }
    }
}
