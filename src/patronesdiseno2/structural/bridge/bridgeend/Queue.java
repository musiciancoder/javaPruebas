package patronesdiseno2.structural.bridge.bridgeend;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

	//composition here
	private LinkedList<T> list; //uses the implementor to provide functionality. Este es el bridge
	
	public Queue(LinkedList<T> list) {
		this.list = list;
	}
	
	@Override
	public void offer(T element) {
		list.clearEverything(); //esto es mío, funciona bien
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}
	
	
}
