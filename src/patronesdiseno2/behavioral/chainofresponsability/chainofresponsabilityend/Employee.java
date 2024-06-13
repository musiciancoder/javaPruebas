package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;

//Abstract handler
public abstract class Employee implements LeaveApprover{

	private String role;
	
	private LeaveApprover successor;
	
	public Employee(String role, LeaveApprover successor) { //notar q el Handler es a la vez un atributo de la clase abstract handler de la cual hereda. Este LeaveApprover es siempre un successor, o sea el siguiente en la cadena de aprobacion
		this.role = role;
		this.successor = successor;
	}
	
	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if(!processRequest(application) && successor != null) { //si el aprobador de turno no aprueba el mismo (false en el método processRequest y si existe otro aprobador en la cadena de mando disponible (successor) ) ...
			successor.processLeaveApplication(application); //...se lo pasa al succesor
		}
	}

	protected abstract boolean processRequest(LeaveApplication application); //este es el método abstacto que deberán implementar los concrete handlers (o sea los aprobadores) para ver si ellos mismos aprueban o no
	
	@Override
	public String getApproverRole() {
		return role;
	} //metodo para saber quien aprueba

	
}