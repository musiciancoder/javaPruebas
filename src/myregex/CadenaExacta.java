package myregex;

import java.util.ArrayList;
import java.util.List;

public class CadenaExacta {
    public static void main(String[] args) {

        List<String> paychecks = new ArrayList<>();
        paychecks.add("Paycheck_Box_EMP_61299_451");
        paychecks.add("Paycheck_Box_EMP_5512_221");
        paychecks.add("Paycheck_Box_EMP_99993_881");
        paychecks.add("Paycheck_Box_EMP_831_141");


        paychecks.replaceAll(person -> person
                .replaceFirst("Paycheck_Box_EMP_", "") // remove prefix
                .replaceFirst("_.*$", ""));             // remove suffix


        System.out.println(paychecks);      // [61299, 5512, 99993, 831]

        List<String> frases = new ArrayList<>();
        frases.add("Soy Andres soy desarrollador y pertenezco a la familia.");
        frases.add("Soy Claudio y pertenezco a la familia soy impedido.");
        frases.add("pertenezco a la familia soy Edgardo y soy el padre.");
        frases.add("soy Miguel.");
        frases.replaceAll(familiar->familiar
                .replaceAll(" y pertenezco a la familia","") //notar q agarra el espacion en blanco de antes de y
        );
        frases.forEach(System.out::println);

        System.out.println("--------------------------------");

        frases.replaceAll(familiar->familiar
                .replaceAll("[CE]","0"));
        frases.forEach(System.out::println);

        System.out.println("--------------------------------");
        frases.replaceAll(familiar->familiar
                .replaceAll("soy","I am"));
        frases.forEach(System.out::println);

        System.out.println("--------------------------------");



    }



}
