package patronesdiseno2.structural.bridge.bridgebegin;

//This is the implementor. 
//Note that this is also an interface
//As implementor is defining its own hierarchy which is not related at all to the abstraction hierarchy.
public interface LinkedList<T> { //esta LinkedList es personalizada de el instructor, NO la de java util
	
	void addFirst(T element);
	
	T removeFirst();
	
	void addLast(T element);
	
	T removeLast();
	
	int getSize();
}
