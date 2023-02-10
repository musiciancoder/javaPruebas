package patronesdiseno.conductuales.visitor;

public interface ItemElement { //en esta interfaz siempre debe ir el metodo accept, a ser implementado en las clases concretas

    public int accept(ShoppingCartVisitor visitor);
}
