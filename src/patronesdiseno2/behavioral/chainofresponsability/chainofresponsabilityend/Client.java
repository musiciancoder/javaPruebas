package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;

import java.time.LocalDate;



public class Client {

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick) //LeaveApplication application es la mierda a aprobar
			   	                      .from(LocalDate.now()).to(LocalDate.of(2018, 2, 28))
			   	                      .build();
	   System.out.println(application);
	   System.out.println("**************************************************");
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application); //acá se le pasa la mierda a aprobar al handler
	   System.out.println(application);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null); //al pasarle un successor null como parametro le decimos que no hay mas aprobadores y que se termina la chain of responsability
		Manager manager = new Manager(director); //el segundo aprobador se lo pasa al tercero
		ProjectLead lead = new ProjectLead(manager); //el primer aprobador se lo pasa al segundo
		return lead; //siempre se devuelve el primer aprobador
	}
	
}
