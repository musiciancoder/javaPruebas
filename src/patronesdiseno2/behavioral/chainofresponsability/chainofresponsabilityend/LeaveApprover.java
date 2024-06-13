package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;

//This represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole();
}
