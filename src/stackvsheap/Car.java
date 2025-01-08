package stackvsheap;

public class Car {                           // Car class definition (class metadata is stored in the heap)
    private String model;                    // Instance variable 'model' (stored in heap memory)
    private int year;                        // Instance variable 'year' (stored in heap memory)
    private static int count = 0;            // Static variable 'count' (stored in heap memory, specifically in the "method area")

    public Car(String model, int year) {     // Constructor (parameters 'model' and 'year' are stored in stack memory)
        this.model = model;                  // 'model' parameter (stack memory) assigned to instance variable 'model' (heap memory)
        this.year = year;                    // 'year' parameter (stack memory) assigned to instance variable 'year' (heap memory)
        count++;                             // Incrementing static variable 'count' (heap memory)
    }

    public String getModel() {               // Method 'getModel' (local variables are stored in stack memory)
        return model;                        // Returning instance variable 'model' (heap memory)
    }

    public void setModel(String model) {     // Method 'setModel' (parameter 'model' is stored in stack memory)
        this.model = model;                  // 'model' parameter (stack memory) assigned to instance variable 'model' (heap memory)
    }

    public int getYear() {                   // Method 'getYear' (local variables are stored in stack memory)
        return year;                         // Returning instance variable 'year' (heap memory)
    }

    public void setYear(int year) {          // Method 'setYear' (parameter 'year' is stored in stack memory)
        this.year = year;                    // 'year' parameter (stack memory) assigned to instance variable 'year' (heap memory)
    }

    public static int getCount() {           // Static method 'getCount' (local variables are stored in stack memory)
        return count;                        // Returning static variable 'count' (heap memory)
    }

    public static void main(String[] args) { // Main method (parameters 'args' and local variables are stored in stack memory)
        Car car1 = new Car("Toyota", 2021);  // 'car1' reference (stack memory), 'Car' object (heap memory)
        Car car2 = new Car("Honda", 2022);   // 'car2' reference (stack memory), 'Car' object (heap memory)

        System.out.println(car1.getModel()); // Call to 'getModel' (stack memory), 'model' (heap memory)
        System.out.println(car2.getYear());  // Call to 'getYear' (stack memory), 'year' (heap memory)
        System.out.println(Car.getCount());  // Call to 'getCount' (stack memory), 'count' (heap memory)
    }
}
