package patronesdiseno.conductuales.visitor;


//cada vez que agregamos una clase concreta lo unico que tenemos que hacer es agregar método visit en el visitor e implementarlo (en este caso en ShoppingCartVisitorImpl),
//lo que nos permite mucha flexibilidad
//El visitor debe conocer siempre y de antemano (lo que puede ser una desventaja)el tipo a pasarles como argumento
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
