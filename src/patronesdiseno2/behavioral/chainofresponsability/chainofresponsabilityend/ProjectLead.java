package patronesdiseno2.behavioral.chainofresponsability.chainofresponsabilityend;

//A concrete handler
public class ProjectLead extends Employee{ //este es el primer aprobador, es el goma del Manager y del Director

	public ProjectLead(LeaveApprover successor) { //notar que el ProjectLead no sabe que esel Manager el próximo aprobador, esto (o sea el Manager) se lo pasamos porparámetro en el cliente
		super("Project Lead", successor);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		//type is sick leave & duration is less than or equal to 2 days
		if(application.getType() == LeaveApplication.Type.Sick) {
			if(application.getNoOfDays() <= 2) {
				application.approve(getApproverRole()); //si se cumplen las dos lineas de arriba, él mismo aprueba
				return true; //al retornar true retornamos una bandera para indicar q el mismo aprobó
			}
		}
		return false; //él mismo no aprobó
	}

	
	
}
