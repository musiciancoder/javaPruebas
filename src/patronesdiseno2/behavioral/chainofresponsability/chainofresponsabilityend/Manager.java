package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;
//A concrete handler

public class Manager extends Employee { ////este es el segundo aprobador, es el goma del Director

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole()); //aprueba él mismo
			return true; //avisa que aprobó el mismo
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false; //no aprobó el mismo
	}
	
}