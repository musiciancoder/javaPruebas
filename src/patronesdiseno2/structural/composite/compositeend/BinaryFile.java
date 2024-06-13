package patronesdiseno2.structural.composite.compositeend;

//Leaf node
public class BinaryFile extends File {
	
	private long size;
	
	public BinaryFile(String name, long size) {
		super(name);
		this.size = size;
	}


	//provides the functionality unrelated to children management
	@Override
	public void ls() {
		System.out.println(getName() +"\t"+size);
	}

	@Override
	public void addFile(File file) {
		throw new UnsupportedOperationException("Leaf node doesn't support add operation");
	}

	@Override
	public File[] getFiles() {
		throw new UnsupportedOperationException("Leaf node doesn't support get operation");
	}

	@Override
	public boolean removeFile(File file) {
		throw new UnsupportedOperationException("Leaf node doesn't support remove operation");
	}
	
	
}
