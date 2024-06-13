package patronesdiseno2.structural.composite.compositeend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite in the composite pattern. It delegates the operations to its childern
public class Directory extends File {

	private List<File> children = new ArrayList<>(); //Esto es un composite porque contiene una coleccion de component base class (File). Es lo mismo q en el ejemplo de Baeldung (Department).
	
	public Directory(String name) {
		super(name);
	}


	//delegates other operations to children
	@Override
	public void ls() { //equivalente al método printDepartmentName() de Baeldung, porque usa File (Departement en Baeldung) en el método (no pasado por parámetro, a diferencia de los
		// otros metodos de aqui) junto con el children
		System.out.println(getName());  //Baeldung no tiene como utilizar algo parecido a getName(), ya q este método aqui esta definido en el component base que es una clase abstracta y aca el component base es una interfaz
		children.forEach(File::ls);
	}


	//implements the children management operations
	//estos metodos son equivalentes a addDepartment() y removeDepartment() de Baeldung
	@Override
	public void addFile(File file) {
		children.add(file);
	}

	@Override
	public File[] getFiles() {
		return children.toArray(new File[children.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		return children.remove(file);
	}
	
}
