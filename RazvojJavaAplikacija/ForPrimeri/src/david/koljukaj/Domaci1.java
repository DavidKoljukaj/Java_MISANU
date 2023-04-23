package david.koljukaj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		 DecimalFormat df = new DecimalFormat("#.##");
			
		 double P=1.0d; 
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Unesite vrednost za n: "); 
		 double n = input.nextInt(); 
		 input.close();
		 for (int i = 1; i <= n; i++) {
			 	P *= (1 - (1 / (i + 1)));
			 	
			 	System.out.println("Dobijena vrednost proizvoda P = "+df.format(P));
		 							}
		 
		double f = (1 - (1 / 2)) * (1 - (1 / 3));
		System.out.println("Dobijena vrednost proizvoda F = "+df.format(f));
	}

}
