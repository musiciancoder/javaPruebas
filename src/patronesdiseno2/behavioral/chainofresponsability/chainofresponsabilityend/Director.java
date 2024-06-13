package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;


//A concrete handler
public class Director extends Employee { //este es el tercer aprobador, es el papá de todos

	public Director(LeaveApprover nextApprover) {

		super("Director", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == LeaveApplication.Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		return false; //dice que no aprobó
	}
	
}
