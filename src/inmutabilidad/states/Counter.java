package inmutabilidad.states;

//Corrected Example for Internal State (with hidden modification):

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    // Method to perform a complex operation that modifies internal state
    public void performComplexOperation() {
        internalIncrement();
        internalDecrement();
    }

    // Private methods to modify the internal state
    private void internalIncrement() { //notar q son privados, por lo q no reciben ningun argumento desde el exterior
        count++;
    }

    private void internalDecrement() {
        if (count > 0) {
            count--;
        }
    }

    // Public method to view the internal state
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Initial count: " + counter.getCount());

        // Perform complex operation
        counter.performComplexOperation();
        System.out.println("Count after complex operation: " + counter.getCount());

        // Perform another complex operation
        counter.performComplexOperation();
        System.out.println("Count after second complex operation: " + counter.getCount());
    }
}
