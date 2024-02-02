package patronesdiseno.solid.singleresponsability.sin;


/*
class is not following single responsibility principle because Employee class should have the single responsibility of maintaining core attributes of an employee. Calculating whether the promotion is due for that Employee or not is not the responsibility of Employee class.
 */
public class Employee{
    private String empId;
    private String name;
    private String address;

    public boolean isPromotionDueThisYear(){
        //promotion logic
        return true;//por devolver algo nomas
    }

    //Getters & Setters
}
