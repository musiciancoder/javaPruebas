package integer;

public class IntegerInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int int1 = 70;
		
		int int2= 80;
		
		int int3 = int1 + int2;
		
		//String str1 = int1; //no es posible pasar de int a String
		
		System.out.println(int3);
		
		Integer Int2 = 70;
		
		Integer Int4 = 60;
		
		Integer Int5 = Int2 +  Int4;
		
		System.out.println(Int5);
		
		String str2 = Int2.toString(); //toString() es una propiedad de cualquier objeto, no exclusivamente un Integer
		
		System.out.println(str2);
		
		String str3 = "45";
		
		Integer Int6 = Integer.parseInt(str3);
		
		System.out.println(Int6);
		
		System.out.println(str3);
		
	    double d = 102939939.939;
	      boolean b = true;
	      long l = 1232874;
	      char arr0 = 'a';
	      
	      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
	     
	      int entero = 5674;

	      System.out.println("Return Value : " + String.valueOf(d) );
	      System.out.println("Return Value : " + String.valueOf(b) );
	      System.out.println("Return Value : " + String.valueOf(l) );
	      System.out.println("Return Value : " + String.valueOf(arr0) );
	      System.out.println("Return Value : " + String.valueOf(arr) );
	      System.out.println("Return Value : " + String.valueOf(entero) ); //int
	      System.out.println("Return Value : " + String.valueOf(Int2) ); //Integer
	      
	      String str4 = String.valueOf(entero); 
	      String str5 = String.valueOf(Int2); 
	      
	      String [] arr1 = str4.split("");
	      
	      for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	      
	      //STRING BUILDER NO ESTA SINCRONIZADA Y ES MAS EFICIENTE
	      StringBuilder builder = new StringBuilder();
	      
	      for (int i = 0; i < arr1.length; i++) {
			
	    	   builder.append(arr1[i]);
	    	  
		}
	      
	      String str9 = builder.toString();
	      System.out.println(str9);
	      
	     
	      // StringBuffer sí esta sincronizada y es menos eficiente
	      
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < arr1.length; i++) {
	         sb.append(arr1[i]);
	        
	      }
	      
	      
	      StringBuffer lala = new StringBuffer();
	      for(int i = 0; i < arr1.length; i++) {
	          String x= lala.append(arr1[i]).toString();
	         System.out.println(x);
	      }
	      
	      
	      String str10 = sb.toString();
	      System.out.println(str10);
	      System.out.println("Hashcode: " + str10.hashCode());
	      System.out.println("Bytes: " + str10.getBytes());
	      System.out.println("Unicode primer char :" + str10.codePointAt(0));
	      
	     String arr2= arr1.toString();
	      
	   }
	
	
	

	}


