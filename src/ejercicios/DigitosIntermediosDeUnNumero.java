package ejercicios;

import java.util.*;
import java.util.stream.Stream;

public class DigitosIntermediosDeUnNumero {

    public static void main(String[] args) {
        int num = 42581;
        String str = String.valueOf(num);
        String[] arrStr = (str.split(""));
        Integer[] numArr = new Integer[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            numArr[i] = Integer.parseInt(arrStr[i]);
        }
        List<Integer> myList = new LinkedList<>(Arrays.asList(numArr));
       // List<Integer> myList = new ArrayList<>();
        List<Integer> myListDos = new ArrayList<>();;

     //   myList = Arrays.asList(numArr);
        Integer a, b, c;
        int x = myList.size();
        while (x!=0) {


            int counter = 0;
            while (counter<myList.size()) {

                a = myList.get(counter);
                counter++;
                if(counter==myList.size()) {
                    break;
                }
                b = myList.get(counter);
                c = b + a;
                myListDos.add(c);
            }
            if (!myListDos.isEmpty())
            System.out.println(myListDos);
         //   myList.clear();
         //   newStrs = new ArrayList<>(strs);
            myList = new ArrayList<>(myListDos);
            myListDos.clear();

x--;

    }


        }
    }

