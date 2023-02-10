package misrecords;

public record EmployeeRecord(String name, int employeeNumber) { //por definicion los records son final y no pueden extender a otras clases, aunque si pueden implementar interfaces

/*
//Igual puede ir un constructor canónico modificado o de otro tipo si lo necesitaramos
public EmployeeRecord(String name, int employeeNumber){
  if(employeeNumber <0){
  throw new IllegalArgumentException("employee cannot be negative");
}
 */


    /*
    //Igual pueden ir métodos ya sea estaticos o no estaticos


    public String nameInUpperCase(){
      return   name.toUpperCase();
    }

    public static void printWhatever(){
        System.out.println("Whatever!!");
    }

     */


}
