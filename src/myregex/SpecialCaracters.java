package myregex;

/*
Java characters that have to be escaped in regular expressions are:
\.[]{}()<>*+-=!?^$|
Two of the closing brackets (] and }) only have to be escaped after opening the same type of bracket.
In []-brackets some characters (like + and -) do sometimes work without escape.
 */

//NOTAR QUE LOS CARACTERES YA HAN SIDO ESCAPADOS EXITOSAMENTE EL IDE LOS MARCA DE COLOR NARANJA). LOS CARACTERES Q NO NECESITAN SER ESCAPADOS EL IDE LOS MARCA COMO VERDE.
//LOS CARACTERES QUE SÍ NECESITAN SER ESCAPADOS EL IDE LOS MARCA COMO DE OTRO COLOR (GENERALMENTE AMARILLO O CELESTE, PERO TAMBIEN OTROS COLORES).

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCaracters {

    public static void main(String[] args) {

        //Salto de linea
        System.out.println("Salto de linea");
        //Considerando a salto de linea NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern0 = Pattern.compile("orem" +
                "\net laborum");
        Matcher matcher0 = pattern0.matcher("orem" +
                "\net laborum"); //-->Contiene, lo q significa q no necesita ser escapado
        if (matcher0.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");


        // .	Find just one instance of any character
        System.out.println(".");
        //Considerando a . como caracter especial de regex
        Pattern pattern = Pattern.compile("a.c"); //debe sí o sí haber un caracter entre a y c, a diferencia de "a*c" donde puede o no haber un caracter entre a y c
        Matcher matcher = pattern.matcher("a3c");
        if (matcher.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //.* Es para decir que debe venir lo que sea hasta emoezar o terminar la palabra
        System.out.println(".*");
        //Considerando a .* como caracter especial de regex
        Pattern pattern1 = Pattern.compile(".*es.*");
        Matcher matcher1 = pattern1.matcher("Andresito es poto al reves");
        int counter = 0;
        if (matcher1.find()){
            counter++;
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");
        System.out.println("counter de .* = " + counter); //da uno, solo Andresito


        //Considerando a . NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern2 = Pattern.compile("foo\\."); //foo y punto en la frase -->notar que el IDE marca el punto de color naranja
        Matcher matcher2 = pattern2.matcher("foofalo");
        if (matcher2.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");


        // [abc]	Find one character from the options between the brackets
        //[^abc]	Find one character NOT between the brackets
        //Considerando a [] como caracter especial de regex
        Pattern pattern3 = Pattern.compile("fulano de ta[a-zA-Z]");
        Matcher matcher3 = pattern3.matcher("fulano de tal");
        if (matcher3.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a [] NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern4 = Pattern.compile("fulano de tal [es un gran pillo]"); //devuelve NO Contiene, pero si cambiamos a "fulano de tal \\[es un gran pillo\\]" entonces Contiene
        Matcher matcher4 = pattern4.matcher("fulano de tal [es un gran pillo]");
        if (matcher4.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        /*
        n{x}	Matches any string that contains a sequence of X n's
        n{x,y}	Matches any string that contains a sequence of X to Y n's
        n{x,}	Matches any string that contains a sequence of at least X n's
         */

        //Considerando a {} como caracter especial de regex
        Pattern pattern5 = Pattern.compile("a{3,}");
        Matcher matcher5 = pattern5.matcher("fulaaaaano de tal"); //contiene mas de 3 a
        if (matcher5.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a {} NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern6 = Pattern.compile("fulano de tal \\{es un gran pillo}"); //devuelve Contiene, notar que solo debemos liberar la llave de entrada, no la llave de salida. Incluso si no hubiera  llave de entrada, no necesitamos liberar la llave de salida
        Matcher matcher6 = pattern6.matcher("fulano de tal {es un gran pillo}");
        if (matcher6.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");





        System.out.println("<>");

        //<> segun stackoverflow no se usa mucho en regular expretions. Si se desea profundizar, visitar https://stackoverflow.com/questions/21063742/greater-than-and-less-than-symbol-in-regular-expressions
        //Sin embargo, como podemos ver de acuerdo al resultado de acá abajo, <> no entraría en la categoría de caracter especial, porque primero el IDE no lo marca con color amarillo (a diferencia de [] y de {} ) , y ademas
        //no hay ningun problema si no escapamos estos caracteres en las siguientes lineas de desarrollo:

        //Considerando a <> NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern7 = Pattern.compile("fulano de tal <es un gran pillo>"); //devuelve Contiene, notar que solo debemos liberar la llave de entrada, no la llave de salida. Incluso si no hubiera  llave de entrada, no necesitamos liberar la llave de salida
        Matcher matcher7 = pattern7.matcher("fulano de tal <es un gran pillo>");
        if (matcher7.matches()){ //con ambos find() y matches() devuelve "Contiene"
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");


        //() in regex denotes a capturing group.
        System.out.println("()");

        //Considerando a () NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern8 = Pattern.compile("fulano de tal \\(es un gran pillo\\)"); //devuelve Contiene, notar que debemos escapar la llave de entrada Y tambien la llave de salida.
        Matcher matcher8 = pattern8.matcher("fulano de tal (es un gran pillo)");
        if (matcher8.matches()){ //devuelve Contiene
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");




        //n*	Matches any string that contains zero or more occurrences of n
        System.out.println("*");

        //Considerando a * como caracter especial de regex
        Pattern pattern10 = Pattern.compile("ab*c");
        Matcher matcher10 = pattern10.matcher("ac"); //contiene cero mas veces b, por lo tanto tenga o no tenga b va a dar siempre Contiene
        if (matcher10.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //Considerando a * NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern11 = Pattern.compile("a\\*");
        Matcher matcher11 = pattern11.matcher("fulano de ta*l  es un gran pillo");
        if (matcher11.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");


        //n+	Matches any string that contains at least one n
        System.out.println("+");
        //Considerando a + como caracter especial de regex
        Pattern pattern12 = Pattern.compile("ab+c");
        Matcher matcher12 = pattern12.matcher("abbbc din"); //baston --> NO Contiene ; barco --> NO Contiene ; abaco --> NO Contiene; abc din --> Contiene; abbbc din -->Contiene.; abbbc din -->Contiene; ac din-->No contiene
        if (matcher12.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //Considerando a * NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern13 = Pattern.compile("a\\+b=c");
        Matcher matcher13 = pattern13.matcher("encontrar el resultado de a+b=c");
        if (matcher13.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        // - --> es para usar rangos
        System.out.println("-");
        //Considerando a - como caracter especial de regex
        Pattern pattern14 = Pattern.compile("hol[a-zA-Z] mundo");
        Matcher matcher14 = pattern14.matcher("hola mundo"); // --> Contiene; holaS mundo -->NO Contiene porque despues de l puede venir solo una letra o mayuscula o minuscula, pero no dos
        if (matcher14.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //Considerando a - NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern15 = Pattern.compile("\\[a-zA-Z]"); //notar q al escapar la apertura del parentesis cuadrado (el signo - se usa para rangos con parentesis cuadrados) ya no necesitamos escapar -
        Matcher matcher15 = pattern15.matcher("[a-zA-Z]"); //Contiene
        if (matcher15.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        // =, ?, <, ! --> (?=X)	X, via zero-width positive lookahead
        //(?!X)	X, via zero-width negative lookahead
        //(?<=X)	X, via zero-width positive lookbehind
        //(?<!X)	X, via zero-width negative lookbehind
        /*
        ( ) Parenthesis with ?: When ? is inside of parenthesis, it works quite uniquely dependent on what comes after that (e.g. =,!,<=,<!,>).  It is used to capture substrings of an input strings. Why do you need this kind of function? Let’s say you want to capture “gold” in the sentence “I like the gold coin.”, but only when it is followed by “coin”.  Cases like this, when you want capture something with conditions but you don’t want to capture the conditions), parethesis with ? inside will be used.
For example, if it is together with equal sign (=), it will look for a substring preceding the parenthesis with conditions, but it only capture the substring outside of parenthesis.
gold(?=\scoin)              I really like the gold coin.
Red part is what is captured, and green is the condition met in the parenthesis. To do negative assertion, you use exclamation ! instead of equal =. For example, if you want to capture “gold” not followed by ” coin”.
gold(?!\scoin\b)           I really like gold medals but not gold coins.
It captures first “gold”, because it is not followed by “coin”, second “gold” is NOT captured because \b defines the end of the word. If you remove the \b, it will capture both “gold”s. If your condition is before the string you want to match, you put < between ? and =.
         */
        System.out.println("=, ?, <, !");
        //Considerando a = como caracter especial de regex
        Pattern pattern16 = Pattern.compile("gold(?=\\scoin) ");
        Matcher matcher16 = pattern16.matcher("I really like the gold coins and silver"); // -->Contiene, porque es seguido de coin, con eso le basta
        if (matcher16.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        Pattern pattern16b = Pattern.compile("gold(?!\\scoin\\b)");
        Matcher matcher16b = pattern16b.matcher("I really like gold medals"); // -->Contiene, porque es seguido de espacio medals que es distinto a espacio coin,
        if (matcher16b.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a = NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern17 = Pattern.compile("a\\+b=c, ¿sera que es asi\\? o es < que una mierda!"); //Notar q no necesitamos escapar = ni ! pero si + ?
        Matcher matcher17 = pattern17.matcher("a+b=c, ¿sera que es asi? o es < que una mierda!"); //-->contiene
        if (matcher17.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");


        //^	Finds a match as the beginning of a string pero como principio de unafrase, no como principio de una palabra intermedia
        System.out.println("^");
        //Considerando a + como caracter especial de regex
        Pattern pattern18 = Pattern.compile("^hola");
        Matcher matcher18 = pattern18.matcher("hola mundo"); //contiene. Notar que con "me llamo Andres, hola mundo" -->no contiene
        if (matcher18.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a ^ NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern19 = Pattern.compile("\\^hola");
        Matcher matcher19 = pattern19.matcher("mundo ^hola"); //contiene. Notar que con "me llamo Andres, hola mundo" -->no contiene
        if (matcher19.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        //$	Finds a match at the end of the string as in: World$
        System.out.println("^");
        //Considerando a $ como caracter especial de regex
        Pattern pattern20 = Pattern.compile("mundo$"); //$ se usa al final de la frase, no al final de una palabra en particular
        Matcher matcher20 = pattern20.matcher("hola mundo"); //contiene
        if (matcher20.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a $ NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern21 = Pattern.compile("cantidad de dinero: \\$200");
        Matcher matcher21 = pattern21.matcher("cantidad de dinero: $200"); //contiene
        if (matcher21.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        // | Find a match for any one of the patterns separated by | as in: cat|dog|fish
        System.out.println("|");
        //Considerando a | como caracter especial de regex
        Pattern pattern22 = Pattern.compile("I have a cat|dog|fish and I love it");
        Matcher matcher22 = pattern22.matcher("I have a dog and I love it");
        if (matcher22.find()){ //contiene, pero notar q con matches() NO contiene
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



        //Considerando a | NO como caracter especial de regex, sino como parte integrante de la frase
        Pattern pattern23 = Pattern.compile("I have a cat \\|dog \\| fish and I love it");
        Matcher matcher23 = pattern23.matcher("I have a cat |dog | fish and I love it"); //contiene
        if (matcher23.find()){
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");

        System.out.println("----------------------------------");

        /*
        Quotation
\	Nothing, but quotes the following character
\Q	Nothing, but quotes all characters until \E
\E	Nothing, but ends quoting started by \Q
         */

        System.out.println("Comillas");
        //Considerando a "" como caracter especial de regex
        Pattern pattern24 = Pattern.compile("The name of the title is 'The fall of the house of Usher'");
        Matcher matcher24 = pattern24.matcher("The name of the title is 'The fall of the house of Usher'");
        if (matcher24.find()){ //contiene, pero notar q con matches() NO contiene
            System.out.println("Contiene");
        } else System.out.println("NO Contiene");



    }
}
