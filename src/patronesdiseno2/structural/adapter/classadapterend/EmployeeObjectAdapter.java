package patronesdiseno2.structural.adapter.classadapterend;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer{

	private Employee adaptee;
	
	public EmployeeObjectAdapter(Employee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public String getName() {
		return adaptee.getFullName(); //Pero notar q para q se pueda hacer esto tiene q haber una relacion entre los metodos de la interfaz con los del adaptee, de hecho el
		//instructor del curso recomienda que haya un cierto grado de relacion entre ellos para que el patron adapter sea posible.
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}

}
