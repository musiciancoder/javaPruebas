package collectionsamigoscode;
/*
Interface List:
-An ordered coollections aka sequences
-Allow duplicates
-Not fixed in size
-Fat for data retrievals
-Various implementations
-ArrayList
-Stack
-Vector
-Others
 */


import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {

        List<String>colorsUnmodifiable= List.of("blue","yellow"); //whenever a list is created this way is unmodifiable
     //   colorsUnmodifiable.add("pink");


        List cualquiera = new ArrayList(); //interfaces cannot be instantiated
        System.out.println(cualquiera.getClass());
        cualquiera.add("blue");
        cualquiera.add("purple");
        cualquiera.add(1);
        cualquiera.add(new Object());

        System.out.println(cualquiera);

        List <String>colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.getClass());
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));


        for (String color:colors
             ) {
            System.out.println(color);
        }

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
