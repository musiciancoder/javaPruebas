package patronesdiseno.creacionales.factory.hackerrank;

import java.util.*;
import java.security.*;
interface Food { //Este es el Product
    public String getType();
}
class Pizza implements Food { //Este es un ConcreteProduct
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food { //Este es otro ConcreteProduct

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory { //Este sería el Factory y el ConcreteFactory al mismo tiempo. Es igual q el ejemplo de mitocode. No me gusta mucho esto porque no se aprecia claramente qué es Factory y qué es ConcreteFactory, sin embargo es lo q mas se ocupa en situaciones reales

    public Food getFood(String order) { //Condicionales en el Factory al igual q el ejemplo de mitocode
        Food food =null;

        if("PIZZA".equalsIgnoreCase(order)){
            food = new Pizza();
        } else if("CAKE".equalsIgnoreCase(order)){
            food = new Cake();
        }
        return food;



    }//End of getFood method

}//End of factory class