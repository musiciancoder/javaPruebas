package ejercicios;

import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();


        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';
        char f = 'f';
        char g = 'g';
        char h = 'h';
        char i = 'i';
        char j = 'j';
        char k = 'k';
        char l = 'l';
        char m = 'm';
        char n = 'n';
        char o = 'o';
        char p = 'p';
        char q = 'q';
        char r = 'r';
        char s = 's';
        char t = 't';
        char u = 'u';
        char v = 'v';
        char w = 'w';
        char x = 'x';
        char y = 'y';
        char z = 'z';

        int inta = 0;
        int intb = 0;
        int intc = 0;
        int intd = 0;
        int inte = 0;
        int intf = 0;
        int intg = 0;
        int inth = 0;
        int inti = 0;
        int intj = 0;
        int intk = 0;
        int intl = 0;
        int intm = 0;
        int intn = 0;
        int into = 0;
        int intp = 0;
        int intq = 0;
        int intr = 0;
        int ints = 0;
        int intt = 0;
        int intu = 0;
        int intv = 0;
        int intw = 0;
        int intx = 0;
        int inty = 0;
        int intz = 0;


        int intBa = 0;
        int intBb = 0;
        int intBc = 0;
        int intBd = 0;
        int intBe = 0;
        int intBf = 0;
        int intBg = 0;
        int intBh = 0;
        int intBi = 0;
        int intBj = 0;
        int intBk = 0;
        int intBl = 0;
        int intBm = 0;
        int intBn = 0;
        int intBo = 0;
        int intBp = 0;
        int intBq = 0;
        int intBr = 0;
        int intBs = 0;
        int intBt = 0;
        int intBu = 0;
        int intBv = 0;
        int intBw = 0;
        int intBx = 0;
        int intBy = 0;
        int intBz = 0;


        StringBuilder builder = new StringBuilder(A);


        for (int numero = 0; numero < builder.length(); numero++) {
            char letra = builder.charAt(numero);
            if (a == letra) {
                inta = inta + 1;
            }
            if (b == letra) {
                intb++;
            }
            if (c == letra) {
                intc++;
            }
            if (d == letra) {
                intd++;
            }
            if (e == letra) {
                inte++;
            }
            if (f == letra) {
                intf++;
            }
            if (g == letra) {
                intg++;
            }
            if (h == letra) {
                inth++;
            }
            if (i == letra) {
                inti++;
            }
            if (j == letra) {
                intj++;
            }
            if (k == letra) {
                intk++;
            }
            if (l == letra) {
                intl++;
            }
            if (m == letra) {
                intm++;
            }
            if (n == letra) {
                intn++;
            }
            if (o == letra) {
                into++;
            }
            if (p == letra) {
                intp++;
            }
            if (q == letra) {
                intq++;
            }
            if (r == letra) {
                intr++;
            }
            if (s == letra) {
                ints++;
            }
            if (t == letra) {
                intt++;
            }
            if (u == letra) {
                intu++;
            }
            if (v == letra) {
                intv++;
            }
            if (w == letra) {
                intw++;
            }
            if (x == letra) {
                intx++;
            }
            if (y == letra) {
                inty++;
            }
            if (z == letra) {
                intz++;
            }
        }

        StringBuilder builderB = new StringBuilder(B);

        for (int numero = 0; numero < builderB.length(); numero++) {
            char letra = builderB.charAt(numero);
            if (a == letra) {
                intBa++;
            }
            if (b == letra) {
                intBb++;
            }
            if (c == letra) {
                intBc++;
            }
            if (d == letra) {
                intBd++;
            }
            if (e == letra) {
                intBe++;
            }
            if (f == letra) {
                intBf++;
            }
            if (g == letra) {
                intBg++;
            }
            if (h == letra) {
                intBh++;
            }
            if (i == letra) {
                intBi++;
            }
            if (j == letra) {
                intBj++;
            }
            if (k == letra) {
                intBk++;
            }
            if (l == letra) {
                intBl++;
            }
            if (m == letra) {
                intBm++;
            }
            if (n == letra) {
                intBn++;
            }
            if (o == letra) {
                intBo++;
            }
            if (p == letra) {
                intBp++;
            }
            if (q == letra) {
                intBq++;
            }
            if (r == letra) {
                intBr++;
            }
            if (s == letra) {
                intBs++;
            }
            if (t == letra) {
                intBt++;
            }
            if (u == letra) {
                intBu++;
            }
            if (v == letra) {
                intBv++;
            }
            if (w == letra) {
                intBw++;
            }
            if (x == letra) {
                intBx++;
            }
            if (y == letra) {
                intBy++;
            }
            if (z == letra) {
                intBz++;
            }


        }
        if(inta==intBa && intb==intBb && intc==intBc && intd==intBd && inte==intBe && intf==intBf && intg==intBg && inth==intBh && inti==intBi && intj==intBj &&
                intk==intBk && intl==intBl && intm==intBm && intn==intBn && into==intBo && intp==intBp && intq==intBq && intr==intBr && ints==intBs && intt==intBt && intu==intBu &&
                intv==intBv && intw==intBw && intx==intBx && inty==intBy && intz==intBz){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }


}

