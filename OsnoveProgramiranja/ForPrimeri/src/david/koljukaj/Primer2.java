 package david.koljukaj;
 import java.io.*;
 import java.text.*; 
 public class Primer2 { 
	 public static void main(String[] args) throws Exception { 
		 DecimalFormat df = new DecimalFormat("#.###"); 
		 BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		 // Inicijalizacija promenljive s 
		 double s = 0; 
		 // Unos vrednosti promenljive n 
		 System.out.print("Unesite vrednost za n: "); 
		 int n = Integer.parseInt(ulaz.readLine()); 
		 if(n < 100) { 
			 // Izračunavanje vrednosti sume 
			 for (int i = 1; i <= n; i++) 
				 if (i != 3)
					 s += (i + 3.5) / (i - 3.0); 
			 	 if(n>=100) {
			 		 s = s-100;
			 	 			}
			 // Štampanje izlaznog rezultata 
			 System.out.println("Dobijena vrednost sume je " + df.format(s)); }
	 }
	 
 }
		 		
	 		
		 
	
 