 package david.koljukaj;

 import java.text.*; 
 public class Domaci2 { 
	 public static void main(String[] args) throws Exception { 
		 DecimalFormat df = new DecimalFormat("#.###"); 
		  
		 // Inicijalizacija promenljive s 
		 double s = 0; 
		
		  
			 // Izračunavanje vrednosti sume 
			 for (int n = 1; n <= 50; n++) 
				 
					 s += Math.pow(-1.0, (n - 1)) * n / (n+1.0); 
			
		
			// Štampanje izlaznog rezultata 
			 System.out.println("Dobijena vrednost sume S = " + df.format(s)); 	 
			 	 			}
			 
 		
	 }
	 
 
		 		
	 		
		 
	
 