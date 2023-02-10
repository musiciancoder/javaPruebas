package patronesdiseno.conductuales.visitor;


public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    //cada vez que agregamos una clase concreta lo unico que tenemos que hacer es agregar método visit en el visitor e implementarlo acá,
    //lo que nos permite mucha flexibilidad

    @Override
    public int visit(Book book) {
        int cost=0;
        //apply 5$ discount if book price is greater than 50
        if(book.getPrice() > 50){
            cost = book.getPrice()-5;
        }else cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }

}