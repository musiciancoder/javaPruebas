package java11;

import java.util.stream.Collectors;

public class StringUpdates {

    public static void main(String[] args) {
        String str = " ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        System.out.println(" ");

        String str1 = "";
        System.out.println(str1.isBlank());
        System.out.println(str1.isEmpty());

        String str2 = "I\nam\nthe\ncreator of my destiny";
       System.out.println(str2); //imprime en lineas
      System.out.println(str2.lines().collect(Collectors.toList())); //imprime [I, am, the, creator of my destiny]

        char c = '\u2000'; //blank space
        str2 = c + str2+c;
        System.out.println(str2);
       System.out.println(str2.strip());
          System.out.println(str2.stripLeading());
   System.out.println(str2.stripTrailing());

        System.out.println("-".repeat(100));
    }



}
