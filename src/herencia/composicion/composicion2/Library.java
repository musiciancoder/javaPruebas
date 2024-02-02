package herencia.composicion.composicion2;

import java.util.List;

// Class 2
// Helper class
// Library class contains list of books.
class Library {

    // Reference to refer to list of books.
    //Esta es la referencia clave de la composición. Una librería tiene libros (no tiene necesariamente q ser una lista pa la composicion, pero en este caso si lo es.).
    private final List<Book> books;

    // Constructor of this class
    Library(List<Book> books)
    {

        // This keyword refers to current instance itself
        this.books = books;
    }

    // Method of this class
    // Getting the list of books
    public List<Book> getListOfBooksInLibrary()
    {
        return books;
    }
}