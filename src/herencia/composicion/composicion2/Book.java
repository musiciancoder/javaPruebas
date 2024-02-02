package herencia.composicion.composicion2;

// Java program to Illustrate Concept of Composition

// Importing required classes
import java.io.*;
import java.util.*;

// Class 1
// Helper class
// Book class
class Book {

    // Member variables of this class
    public String title;
    public String author;

    // Constructor of this class
    Book(String title, String author)
    {

        // This keyword refers top current instance
        this.title = title;
        this.author = author;
    }
}