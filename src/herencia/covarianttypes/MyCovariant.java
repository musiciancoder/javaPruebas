package herencia.covarianttypes;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
CovariantTypes allow allow to pass subclass return on a method when this method is overriding a method from the superclass
*/

class Flower {
    public String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    //@Override //optional
    public String whatsYourName(){
        return "Jasmine";
    }
}


class Lily extends Flower {
    //@Override //optional
    public String whatsYourName(){
        return "Lily";
    }
}


class Region {
    public Flower yourNationalFlower(){
        Flower flower = new Flower();
        return flower;
    }
}

class WestBengal extends Region {
    //@Override //optional
    public Flower yourNationalFlower(){
        Jasmine jasmine = new Jasmine();
        return jasmine; //we are returning a sublclass of flower
    }
}

class AndhraPradesh extends Region {
    //@Override //optional
    public Flower yourNationalFlower(){
        Lily lily = new Lily();
        return lily; //we are returning a sublclass of flower
    }
}


public class MyCovariant {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //ingersar como valor AndhraPradesh en el scanner
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
