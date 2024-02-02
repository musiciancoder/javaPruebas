package manipularcadenas;

public class MyStringBuilder1 {

    public static void main(String[] args) {

        String str1 = "Megatron";//8

        StringBuilder builder1 = new StringBuilder(str1);
        StringBuilder builder2 = new StringBuilder("Optimus");//7
        StringBuilder builder3 = new StringBuilder(" ");;
        System.out.println(builder1);
        System.out.println("Capacity: " + builder1.capacity());
        System.out.println("Insert: " + builder1.insert(7,"m"));
        System.out.println("IndexOf: "+builder1.indexOf("g"));
        System.out.println("Substring: " +builder1.substring(4));
        System.out.println("CharAt: " + builder2.charAt(1));
        builder1 = builder1.insert(7,"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        builder1.capacity();
        System.out.println( builder1.capacity());

        for (int i = builder2.length()-1; i >=0 ; i--) {
           char mychar = builder2.charAt(i);
           builder3.append(mychar);
            System.out.println(builder3);
        }


    }
}
