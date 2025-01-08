package java21.instancemainmethods;



public class InstanceMainExample {



    /*

Instance Main Methods
Instance main methods provide a more flexible way to define the entry point of a Java application.
Instead of requiring a static main method, you can now define an instance main method, which allows for more natural object-oriented programming.

Features:
Instance Context:

Allows the main method to have access to instance fields and methods, enabling more object-oriented design.

Flexibility:

Provides more flexibility in how you organize your application's entry point, making it easier to work with instances of classes.


    // Instance fields
    private String message = "Hello, Java 21!";

    // Instance main method
    public void main(String[] args) {  //notar q aqui dentro ahora podemos llamar a metodos y variables no estaticas
        System.out.println(message);
    }

    public static void main(String[] args) {
        new InstanceMainExample().main(args); // Invoking the instance main method


     */
    }


