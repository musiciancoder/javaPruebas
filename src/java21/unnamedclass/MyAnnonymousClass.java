package java21.unnamedclass;

public class MyAnnonymousClass {

    /*
    Copilot
    what is the difference between an unnamed class and a regular annonymous class ?
The concept of unnamed classes in Java 21 is closely related to traditional anonymous classes, but with some nuances and specific features. Let's break down the differences between them:

Anonymous Class
Definition:
An anonymous class is a local class without a name. It is defined and instantiated in a single expression.

Syntax:

Anonymous classes are typically used when you need to override methods or provide implementations for interfaces or abstract classes.
They are created using the new keyword followed by a class or interface name and a class body.

java
Button button = new Button("Click me");
button.addActionListener(new ActionListener() { //notar q la palabra reservada 'new' va dentro del parentesis lo q permite pasar por argumento un objeto perteneciente a la clase anonima
    @Override  //Notar q la clase anonima necesariamente hereda/implementa una clase abstracta/interfaz (en este caso ActionListener)
    public void actionPerformed(ActionEvent e) { //sobreescribimos el metodo de la  clase padra
        System.out.println("Button clicked!");
    }
});
Use Cases:

Commonly used for event handling and implementing interface methods on-the-fly.
Suitable for situations where you need a quick, one-time-use class implementation.

Limitations:

Limited to providing implementations for interfaces or abstract classes.
Cannot define constructors, instance initializers, or static initializers.
     */
}
