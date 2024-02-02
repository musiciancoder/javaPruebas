package patronesdiseno.creacionales.factory.hackerrank;

import java.util.*;
import java.security.*;
interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        Food food =null;

        if("PIZZA".equalsIgnoreCase(order)){
            food = new Pizza();
        } else if("CAKE".equalsIgnoreCase(order)){
            food = new Cake();
        }
        return food;



    }//End of getFood method

}//End of factory class