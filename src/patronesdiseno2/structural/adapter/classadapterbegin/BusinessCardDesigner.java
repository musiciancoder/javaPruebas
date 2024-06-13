package patronesdiseno2.structural.adapter.classadapterbegin;

/**
 * Client code which requires Customer interface. Quiere tener acceso a Employee
 */
public class BusinessCardDesigner { //notar q ya q la idea es q esta clase acceda a Employee podríamos extender a Employee, pero entonces violariamos single responsability, porq generalmente esta clase se usa con otro propósito y al sobrescribir los metodos de Employee quedaría con responsabilidades distintas

	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}


}
