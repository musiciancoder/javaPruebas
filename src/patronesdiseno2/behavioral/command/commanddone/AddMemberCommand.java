package patronesdiseno2.behavioral.command.commanddone;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command{
	
	private String emailAddress;
	
	private String listName;
	
	private EWSService receiver;
	
	public AddMemberCommand(String email, String listName, EWSService service) { //el receiver es opcional, pero parametros como email o listName no son opcionales, deben ir para poderselos pasar a execute()
		this.emailAddress = email;
		this.listName = listName;
		this.receiver = service;
	}
	
	@Override
	public void execute() {
		receiver.addMember(emailAddress, listName);
	}
		

}
