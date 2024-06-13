package patronesdiseno2.structural.composite.compositeend;

public class Client {
/*
	Overall goal of this design pattern is to make sure

	that the client code or the code which is working with our tree structure, is able to work without

	doing any casting up, casting down, casting, whatever you need.

	Goal of composite pattern is to simpliyfy the client code by allowing it to treat the composites and leaf nodes in the same way.


 */

	//Using composite once its built is the same theather working on composite or leaf
	public static void main(String[] args) {
		File root1 = createTreeOne();
		root1.ls();
		System.out.println("***********************************");
		File root2 = createTreeTwo();
		root2.ls();
	}
	
	//Client builds tree using leaf and composites
	//Tree structure Objeto A y B de una clase y C y D de otra -->A.add(C), A.add(D), B.add(D), B.add(A), ect
	private static File createTreeOne() { //Notar que no hacemos ningun casting acá en el cliente para File, BinaryFile o Directory
		File file1 = new BinaryFile("File1", 1000); //leaf -->notar q el cliente tiene acceso al leaf. Instancia BaseComponent baseComponent = new Leaf igual q Baeldung con Department salesDepartment = new SalesDepartment(1, "Sales department");
		Directory dir1 = new Directory("dir1"); //composite -->notar q el cliente tambien tiene acceso al composite. Instancia. Instancia Composite composite = new Composite(), igual q Baeldung con     HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
		dir1.addFile(file1); //a un metodo children del composite se le pasa por parámetro un objeto del leaf, igual q en Baeldung con  headDepartment.addDepartment(salesDepartment);
		File file2 = new BinaryFile("file2", 2000);
		File file3 = new BinaryFile("file3", 150);
		Directory dir2 = new Directory("dir2");
		dir2.addFile(file2);
		dir2.addFile(file3);
		dir2.addFile(dir1);
		return dir2;
	}
	
	private static File createTreeTwo() {
		return new BinaryFile("Another file", 200);
	}
}
