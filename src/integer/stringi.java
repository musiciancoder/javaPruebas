package integer;

public class stringi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Integer a = 2;
	
	String b = "3";
	
	String x = "x";
	
	int c = 4;
	
	String d = a +b;
	
	String e = b +c;
	
	System.out.println(" a + b: " + a +b);
	
	System.out.println(" a + x: " + a + x);
	
	System.out.println(d.getClass().getName());
	
	System.out.println(e.getClass());
	
	if(e instanceof String) {
		System.out.println(true);
	}
	
	System.out.println(" a + c: " + a +c);
		
	}

}
