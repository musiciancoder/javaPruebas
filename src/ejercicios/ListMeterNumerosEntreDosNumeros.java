package ejercicios;

/*
Comparar dos primeros numeros de un numero de x cifras.
Si el tercer numero es mayor que uno de ellos pero menor que el otro pasa al extremo opuesto, si es mayor que los dos o menor que los dos pasa al medio.
 */

import java.util.*;

public class ListMeterNumerosEntreDosNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        List<String> list1 = new ArrayList<>();
        list1 = Arrays.asList(str.split(""));
        List <Integer> list0 = list1.stream().map(s->Integer.parseInt(s)).toList();
        LinkedList<Integer>list2=new LinkedList<>();
        list2.add(list0.get(0));
        list2.add(list0.get(1));
        for (int i = 2; i < list0.size(); i++) {
            int p = list0.get(i);
            if((list0.get(i)<list2.get(0) && list0.get(i)<list2.get(1)) || (list0.get(i)>list2.get(0) && list0.get(i)>list2.get(1))){
                //int e = list2.get(1);
                list2.add(1, list0.get(i));
            }
            if((list0.get(i)<list2.get(0) && list0.get(i)>list2.get(1))){
                list2.addFirst(list0.get(i));
            }
            if((list0.get(i)>list2.get(0) && list0.get(i)<list2.get(1))){
                list2.addLast(list0.get(i));
            }
        }

        System.out.println(list2);

    }
}
//probando con 36427
//364-->ok
//3264-->ok
//37264-->ok

//probando con 63427
//463-->ok
//4263-->ok
//47263-->ok