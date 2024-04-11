package ejercicios;

import static javax.swing.text.html.HTML.Tag.I;

public class NumerosRomanos {

    public static void main(String[] args) throws Exception {
        int numero = 2998;
        if (numero<0 || numero>3999){
            throw new Exception("Numero debe ser mayor a cero y menor a 9999");
        }

        String str = String.valueOf(numero);
        int l = str.length();



        if (l ==1){
            System.out.println(unidades(str.charAt(l-1)));
        }

        if (l ==2){
            System.out.println(decenas(str.charAt(l-2))+unidades(str.charAt(l-1)));
        }

        if (l ==3){
            System.out.println(centenas(str.charAt(l-3))+decenas(str.charAt(l-2))+unidades(str.charAt(l-1)));
        }

        if (l ==4){
            System.out.println(miles(str.charAt(l-4))+centenas(str.charAt(l-3))+decenas(str.charAt(l-2))+unidades(str.charAt(l-1)));
        }



    }

    public static String unidades(char c){
        String dec = null;
        switch (c){
            case '1':
                dec = "I";
                break;
            case '2':
                dec = "II";
                break;
            case '3':
                dec = "III";
                break;
            case '4':
                dec = "IV";
                break;
            case '5':
                dec = "V";
                break;
            case '6':
                dec = "VI";
                break;
            case '7':
                dec = "VII";
                break;
            case '8':
                dec = "VIII";
                break;
            case '9':
                dec = "IX";
                break;
        }
        return dec;
    }

    public static String decenas(char c){
        String dec = null;
        switch (c){
            case '1':
                dec = "X";
                break;
            case '2':
                dec = "XX";
                break;
            case '3':
                dec = "XXX";
                break;
            case '4':
                dec = "IL";
                break;
            case '5':
                dec = "L";
                break;
            case '6':
                dec = "LI";
                break;
            case '7':
                dec = "LII";
                break;
            case '8':
                dec = "LIII";
                break;
            case '9':
                dec = "IC";
                break;
        }
        return dec;
    }

    public static String centenas(char c){
        String dec = null;
        switch (c){
            case '1':
                dec = "C";
                break;
            case '2':
                dec = "CC";
                break;
            case '3':
                dec = "CCC";
                break;
            case '4':
                dec = "ID";
                break;
            case '5':
                dec = "D";
                break;
            case '6':
                dec = "DI";
                break;
            case '7':
                dec = "DII";
                break;
            case '8':
                dec = "DIII";
                break;
            case '9':
                dec = "IM";
                break;
        }
        return dec;
    }


    public static String miles(char c){
        String dec = null;
        switch (c){
            case '1':
                dec = "M";
                break;
            case '2':
                dec = "MM";
                break;
            case '3':
                dec = "MMM";
                break;

        }
        return dec;
    }




}
