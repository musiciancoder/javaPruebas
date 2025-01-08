package java21;

/*
from your response above, is StructuredTaskScope class responsable for virtual threads ?
Copilot
Not exactly. The StructuredTaskScope class is a tool that helps manage tasks and their lifecycles when using virtual threads, but it's not responsible for creating virtual threads themselves. Virtual threads are a feature of the JVM introduced with Project Loom.
Here's a more detailed breakdown:
Virtual Threads: These are lightweight threads managed by the JVM (instead of regular threads that are managed by the OS), introduced to improve the scalability and simplicity of concurrent programming.
StructuredTaskScope: This is a class that provides a structured way to manage multiple tasks, allowing you to create and manage virtual threads more easily. It helps in organizing and controlling the lifecycle of tasks that run in virtual threads, making it easier to handle their creation, execution, and completion.
The StructuredTaskScope class provides a clean and convenient way to use virtual threads, but the creation and management of the virtual threads themselves are handled by the JVM.
If you have more questions about how to use virtual threads or the StructuredTaskScope class, feel free to ask!

Usted

What is Project Loom ?
Copilot
Project Loom is an initiative within the OpenJDK community aimed at introducing lightweight concurrency constructs to Java1
The primary goal of Project Loom is to support a high-throughput, lightweight concurrency model, making it easier to write and maintain concurrent applications1

 */

//import jdk.incubator.concurrent.StructuredTaskScope; //se requiere jdk.incubator.concurrent en el pom pa q compile !!!!!!!

public class VirtualThreadExample {

    /*
    public static void main(String[] args) throws InterruptedException {
        try (var scope = new StructuredTaskScope<Void>()) { //try with resources
            scope.fork(() -> {
                // This code will run in a virtual thread
                System.out.println("Hello from virtual thread: " + Thread.currentThread());
                return null;
            });

            scope.join(); // Wait for all tasks to complete
        }
    }


     */
}

