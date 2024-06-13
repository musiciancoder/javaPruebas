package patronesdiseno2.structural.decorator.decoratorend;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m); //notar que en este patron debemos pasar por parametro una instancia del Concrete Component al constructor del decorator
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator); //esto es recursive composition, o sea un decorator envolviendo a otro decorator
		System.out.println(decorator.getContent());
	}
}
