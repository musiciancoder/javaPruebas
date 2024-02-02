package ejercicios;

import java.util.Scanner;

public class StringTokensWithRegEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        scan.close();
        String lala;
        String regEx ="\\s|'|'?'";
        String[] array = s.split(regEx, 40000);
        System.out.println(array.length);
        for (String p:
             array) {
            if (p.contains(",")){
           lala= p.replace(","," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
            if (p.contains("!")){
                lala= p.replace("!"," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
            if (p.contains("?")){
                lala= p.replace("?"," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
            if (p.contains(".")){
                lala= p.replace("."," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
            if (p.contains("_")){
                lala= p.replace("_"," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
            if (p.contains("@")){
                lala= p.replace("@"," ");
                System.out.println(lala);
            }else{ System.out.println(p);}
        }

    }

}
