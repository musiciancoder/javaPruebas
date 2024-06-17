package ejercicios;

import java.util.*;

public class NumerosConDigitosIntermediosUnosDeOtros {


    //CON ARRAYS
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        String str1 = String.valueOf(number1);
        String [] stringArray1 = new String[str1.length()];
        stringArray1 =str1.split("");
        while (scanner.hasNextInt()) {
            int number2 = scanner.nextInt();
           String str2 = String.valueOf(number2);
           String [] stringArray2 = new String[str2.length()];
           stringArray2 =str2.split("");
            String [] stringArray3 = new String[stringArray1.length + stringArray2.length];
            int counter1=0;
            int counter2=0;



            for (int i = 0; i < stringArray1.length + stringArray2.length; i++) {
                if (i % 2 == 0 && (i-counter2)< stringArray1.length){
                    counter1++;
                    stringArray3[i] = stringArray1[i-counter2];
                } else if((i-counter1)< stringArray2.length) {
                    counter2++;
                    stringArray3[i] = stringArray2[i-counter1];
                }
            }

            stringArray1 = stringArray3;
            System.out.println(Arrays.toString(stringArray1));
        }

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        List<String>integerList1= new ArrayList<>(Arrays.asList(String.valueOf(number1).split("")));
        while (scanner.hasNextInt()){
            int n = integerList1.size();
            int number2 = scanner.nextInt();
            List<String>integerList2= new ArrayList<>(Arrays.asList(String.valueOf(number2).split("")));
            integerList1.addAll(integerList2);
            int counter = 0;
            for (int i = 1; i < integerList2.size(); i++) {
                if (i%2!=0){
                    Collections.swap(integerList1, i, (n-integerList2.size())-1+i);
                }
                System.out.println(integerList1);
            }

        }
    }
}
