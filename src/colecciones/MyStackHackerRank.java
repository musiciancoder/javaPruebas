package colecciones;



import java.util.*;
class MyStackHackerRank{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        List<String>list = new ArrayList<>();
        while (sc.hasNextLine()){
String input = sc.nextLine();
            int l = input.length();
            boolean b = true;
            for (int i = 0; i < l; i++) {
                char a = input.charAt(i);
                char c = input.charAt(l-1-i);
                switch(a) {
                    case '(':
                        if (c!=')'){
                            b = false;
                            System.out.println(b);
                            return;
                        }
                        break;
                    case '[':
                        // code block
                        if (c!=']'){
                            b = false;
                            System.out.println(b);
                            return;
                        }
                        break;
                    case '{':
                        // code block
                        if (c!='}'){
                            b = false;
                            System.out.println(b);
                            return;
                        }
                        break;
                    default:
                        b=true;
                      
                }

            }

            System.out.println(b);

        }



    }
}


