package patronesdiseno2.structural.composite.compositeend;

//The component base class for composite pattern
//defines operations applicable both leaf & composite 
public abstract class File {  //en Baeldung el component base class es una interfaz, pero esto no cambia casi nada

	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public abstract void addFile(File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
