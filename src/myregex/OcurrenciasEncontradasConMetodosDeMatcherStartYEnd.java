package myregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OcurrenciasEncontradasConMetodosDeMatcherStartYEnd {

    public static void main(String[] args) {
        Pattern pg = Pattern.compile("r+");
        Matcher mg = pg.matcher("ramon arrabiaba el arrrabio");
        while (mg.find())
            System.out.println("Pattern found from " + mg.start() +
                    " to " + (mg.end()-1));
    }
}
