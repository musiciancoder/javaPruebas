package java21.stringliterals;

public class MyStringLiterals {
    /*
    String templates provide a new way to embed expressions within string literals, making string concatenation more readable and less error-prone
    Usted
    In 3. String Templates (JEP 430) what do you mean by less error-prone
    Copilot
In the context of JEP 430: String Templates, "less error-prone" means that the new feature reduces the likelihood of mistakes when composing strings in Java1
. Traditional methods of string composition, like using the + operator or StringBuilder, can be verbose and easy to mess up, especially with spaces and quotation marks
     */

    String name = "Alice";
    int age = 30;
    public MyStringLiterals() {
        System.out.println("Hello, " + " name! You are " + age + " years old."); //notar lo verboso q es esto con string literals nos evitamos todas las "" y los +
        //   System.out.println(`Hello, ${name}! You are ${age} years old.`);  //Con java 19 sí compila, con java inferior a 19 no.
    }

}
