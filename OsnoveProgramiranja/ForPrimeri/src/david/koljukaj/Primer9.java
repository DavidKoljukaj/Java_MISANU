package david.koljukaj;

import java.util.Scanner;

public class Primer9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double a,y;
		System.out.println("Unesite vrednost za n: "); 
		int n = input.nextInt(); 
		if(n>0) {
		for(int i = 1; i <= n; i++) { 
			System.out.println("Unesite vrednost broja a: "); 
			a = input.nextDouble(); 
			
			if (a > 0) y = Math.sqrt(a); 
			else y = Math.pow(a, 2);
			System.out.println("Za unete vrednosti a = " + a  + " dobija se y = " + y); } 
			input.close(); 
				}else
				System.out.println("Vrednost za n mora biti veca od nule!");
	}
	
}
