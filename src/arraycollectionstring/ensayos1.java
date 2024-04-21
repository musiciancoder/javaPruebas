package arraycollectionstring;



public class ensayos1 {
	

	
	public static void main(String[] args) {
		
		boolean contieneHigos = true;
		 
		
		
		String [] frutas = new String []{"naranjas","manzanas","peras", "uvas"};
		
		
		
		
		for (String fruta : frutas) {
			if (fruta.equals("higos")) {
				contieneHigos = true;
				
			}else {
				contieneHigos = false;
			}
		}
		
		if(contieneHigos ==true) {
			System.out.println("Contiene higos");
		}else {
			System.out.println("No contiene higos");
		}
		
		Object codigo = frutas.hashCode();
				
		System.out.println(codigo);
		
		Integer numero = 1;
		
		System.out.println(numero.toString());
		
		Integer [] numeros = {1,2,3,4};
		
		System.out.println(numeros.toString());

         for (Integer numero1 : numeros) {
        	 
        	 String elNumero = numero1.toString();
        	 
        	 System.out.println(elNumero);
        	 
        	 System.out.println(elNumero.hashCode());
			
		}
         
         
		
	}
	
 

}
