package ejercicios;

import java.util.Arrays;

public class FigurasConArrays {

	private static String res;
	private static int n=8;
	
	public static void main(String[] args) {
	
		
		String[] myArr = new String[n]; 
		for (int j = 0; j <myArr.length ; j++) {
			for (int i = 0; i < myArr.length; i++) {
				myArr[i] = "0";
				if (i==j || i==myArr.length-1-j) {
					myArr[i] = "x";
					
			}

			
		}
			 res= Arrays.toString(myArr);
			System.out.println(res);

				
	}
	    
		if (res instanceof String) {
			System.out.println("");
			System.out.println("Es string");
			System.out.println("");
		}
	
	/*public static  String[][] equis (Integer n) {
		String[][] myArr = new String[n][n]; 
		for (int j = 0; j <myArr.length ; j++) {
			for (int i = 0; i < myArr.length; i++) {
				if (i==j ) {
					myArr[i][j] = "x";
					myArr[i][j-i]="x";
				}else {
				myArr[i][j] = "0";
				}
				
			}
		}
		
		return myArr;
	}*/
		
		FigurasConArrays.Cuadrado();
	
	}
	
	//CUADRADO
	public static void Cuadrado () {
		String[] myArr = new String[n]; 
		for (int j = 0; j <myArr.length ; j++) {
			for (int i = 0; i < myArr.length; i++) {
				myArr[i] = "0";
				if (i==0 || i==myArr.length-1) {
					myArr[i] = "x";
					
			}
				if(j==0 || j==n-1) {
					myArr[i] = "x";
				}
			
		}
			
			res= Arrays.toString(myArr);
			System.out.println(res);

				
	}
		
	}
	
}
