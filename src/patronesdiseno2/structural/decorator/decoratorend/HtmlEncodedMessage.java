package patronesdiseno2.structural.decorator.decoratorend;

// import org.apache.commons.text.StringEscapeUtils; //Necesito el jar

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message {

	// Segun yo no se puede usar super pq Message no es clase, sino interfaz, ento nos obliga a llamar a getContent() con una variable de la interfaz pasada por parametro en el constructor

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	@Override
	public String getContent() {
return "The * is strong with this one!"; //debiera ir la linea de mas abajo, pero no puedo pegar el jar de org.apache.commons.text
	//	return StringEscapeUtils.escapeHtml4(msg.getContent());  //se añade funcionalidad adicional.
	}

	
}
