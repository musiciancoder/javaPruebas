package myregex.misejerciciosregex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ContarErresDeCadaPalabraDeUnaFrase {

    public static void main(String[] args) {
        String str = "ramon arrabiaba el arrrabio para el arriero";
        List<String>stringList = new ArrayList<>(Arrays.asList(str.split(" ")));
        Pattern pattern = Pattern.compile("r");
        stringList = stringList.stream().filter(s->s.contains("r")).collect(Collectors.toList());

        stringList.forEach(s -> {
            int counter = 0;
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()){
                counter++;
            }
            System.out.println(s + " contains " + counter + " words with 'r'");
        });
    }
}
