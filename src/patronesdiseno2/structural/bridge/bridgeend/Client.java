package patronesdiseno2.structural.bridge.bridgeend;

public class Client {

	/*
	This is how bridge design pattern works when we are talking about abstraction. Here,

	we can add any more any class to this particular inheritance hierarchy or we can modify our existing

Fifo collection class so we can add another method that says maybe peek method that simply returns whatever is present at the top of queue, but it won't remove it.

Do we need any change in the LinkedList?

No.

So this is what they say.

This is what they mean when they say that you can change the abstraction without needing change to implementation.

So we can add a peek method (en FifoCollection) and we can provide implementation of that without requiring any change to

our linkedlist class.

Or we can change our linked list and provide a method that basically says clear everything and we don't need any change in our Abstraction. -->esto lo puse en el código para probarlo

So the key to understanding Bridge is that when they say that we can vary abstraction and implementation

separately, they are talking about the abstraction in terms of methods that are used by client.

And these methods hide how the functionality is provided using the implemented classes.
	 */

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(10); //notar q collection tiene acceso indirecto a los metdos del implementor
		collection.offer(40);
		collection.offer(99);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		//
		System.out.println(collection.poll());
	}

}
