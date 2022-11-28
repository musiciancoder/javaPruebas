package mystatic;



// Java program to Demonstrate How to
// Implement Static and Non-static Classes

// Class 1
// Helper class
public class OuterClass {

    public static void main(String[] args) {
        NestedStaticClass nestedStaticClass = new NestedStaticClass(); //Note a Nested Static Class can be perfectly instantiated on main method from Outer class
        nestedStaticClass.printMessage2();

    }

    // Input string
    private static String msg = "GeeksForGeeks";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage()
        {

            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println(
                    "Message from nested static class: " + msg);
        }

        public void printMessage2(){
            System.out.println("Im message 2!");
        }

        //This two variables are never visible from the Outer-Class
        private String staticVariable = "Im static variable" ;
        private String nonStaticVariable = "Im non-static variable" ;
    }


    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {

            // Print statement whenever this method is
            // called
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }

        //Again, this two variables are never visible from the Outer-Class
        private String staticVariable2 = "Im static variable2" ;
        private String nonStaticVariable2 = "Im non-static variable2" ;
    }


}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        /*
        NestedStaticClass nestedStaticClass = new NestedStaticClass(); //Note a Nested Static Class can be instantiated on main method from a different  class, we need to write the OuterClass.NestedStaticClass() syntaxis.
        nestedStaticClass.printMessage2();*/

        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
        nestedStaticClass.printMessage2();

        // Creating instance of nested Static class
        // inside main() method
        OuterClass.NestedStaticClass printer
                = new OuterClass.NestedStaticClass();

        // Calling non-static method of nested
        // static class
        printer.printMessage();

        // Note: In order to create instance of Inner class
        // we need an Outer class instance

        // Creating Outer class instance for creating
        // non-static nested class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner
                = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();

        // We can also combine above steps in one
        // step to create instance of Inner class
        OuterClass.InnerClass innerObject
                = new OuterClass().new InnerClass();

        // Similarly calling inner class defined method
        innerObject.display();

        //
        OuterClass myOuter = new OuterClass();

    }
}
