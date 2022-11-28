package primitivesandwrappers;

public class IntegerIntString {

	/*the primitive types live in the stack while the reference types live in the heap.
	This is a dominant factor that determines how fast the objects get be accessed.
	 It's required more time to perform the operation for wrapper classes. However arrays and lists from kind Object[]  work better with wrapper clases*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int int1 = 70;


		System.out.println(int1);

		//PASAR DE PRIMITIVA A OBJETO WRAPPER CLASS

	//	Integer integer1= new Integer(int1);//mediante wrapper class
		Integer integer1=int1;//lo mismo pero codigo mas simple

		System.out.println("integer1 pertenecea a la clase: " + integer1.getClass());
		if(integer1 instanceof Object){
		System.out.println("integer1 es un objeto!");
		}

		//PASAR DE OBJETO WRAPPER CLASS A PRIMITIVA
		int int2=Integer.valueOf(integer1);

		System.out.println("int2: " + int2);
		

		//PASAR DE OBJETO WRAPPER CLASS A STRING

		Integer integer2=80;
		
		String str2 = integer2.toString();
		
		System.out.println("De Integer a String: " + str2 + "; the class is: " + str2.getClass().getName());

		//PASAR DE STRING A OBJETO WRAPPER CLASS
		
		String str3 = "45";
		
		Integer Int6 = Integer.parseInt(str3);
		
		System.out.println("De string a Integer:" + Int6 + "; the class is: " + Int6.getClass().getName());

		//PASAR DE STRING A PRIMITIVA
		
        int int3=Integer.valueOf(str3); //con Integer.parseInt(str3) pasa a int o a Integer, depende de como uno lo reciba

		System.out.println("De String a int: " + int3);

		//PASAR DE PRIMITIVA A STRING

		int int4 = 2;

		String strValue = String.valueOf( int4 );

		System.out.println("De int a String: " + strValue + ", and " + strValue + " pertenece a la clase: " + strValue.getClass().getName());


		//Arrays y listas de tipo Object[] funcionan solo con wrapper clases
		int [] myArray = new int []{1,2,3};
		Object[] myArrayObject = new Integer[]{1,2,3};

		int int5=5;
		float float1=  int5; //las primitivas pueden ser cambiadas entre ellas mediante casting
		long long1= (long) float1;

		Integer integer5=int5; // se puede pasar directamente de primitiva a un wrapper class del mismo tipo
		// Float float2 = int5; //no se puede pasar directamente de primitiva a un wrapper class diferente
		Float float2 = (float) int5;



		//boolean myboolean = null; //wrapper classes DO NOT accept null as a value (does not compile)
		Boolean myboolean = null; //wrapper classes DO accept null as a value
	}

}
