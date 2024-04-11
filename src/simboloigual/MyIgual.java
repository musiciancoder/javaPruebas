package simboloigual;

import java.sql.SQLOutput;

public class MyIgual {

    public static void main(String[] args) {
        int s1=5 , s2=5;

        if(s1==s2){
            System.out.println("same");}
        else{
            System.out.println("not same");
        }
        System.out.println(" ");

        //StringPool
        System.out.println("STRINGPOOL");
        System.out.println("==");
        String str1="hola";
        String str2="hola";
        if (str1==str2){
            System.out.println("igualdad en Strings del stringpool");
        }else {
            System.out.println("desigualdad en Strings del stringpool");
        }

        if (str1.equals(str2)){
            System.out.println("equals en Strings del stringpool");
        }else {
            System.out.println("no equals en Strings del stringpool");
        }

        System.out.println(" ");

        //No StringPool
        System.out.println("NO STRINGPOOL");
        String str3=new String("abc");
        String str4=new String("abc");
        if (str3==str4){
            System.out.println("igualdad en Strings del NO stringpool");
        }else {
            System.out.println("desigualdad en Strings del NO stringpool");
        }

        if (str3.equals(str4)){
            System.out.println("equals en Strings del NO stringpool");
        }else {
            System.out.println("no equals en Strings del NO stringpool");
        }

        System.out.println(" ");

        //User (clase sin sobrescribir equals ni hashcode)
        System.out.println("USER");
        User user1 = new User(22, "Jorge");
        User user2 = new User(22, "Jorge");
        if (user1==user2){
            System.out.println("igualdad en User");
        }else {
            System.out.println("desigualdad en User");
        }

if (user1.equals(user2)){
    System.out.println("equals en User");
}
else {
    System.out.println("unequals en User");
}

        /*
        if(s1===s2){ //=== no existe en java, si en javascript
            System.out.println("same");
 }
else{
System.out.println("not same");
        }
*/



    }


}

class User{
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
