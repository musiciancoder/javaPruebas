package patronesdiseno2.behavioral.state.done;

//Context class //El context contiene el estado actual
public class Order {
	//current state of order
	private OrderState currentState;
	
	public Order() {
		currentState = new New();
	}
	
	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
