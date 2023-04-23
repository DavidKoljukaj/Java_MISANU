package david.koljukaj;

import java.util.Scanner;

public class Primer2 {

	public static void main(String[] args) {
			int n;
			int cifra;
			Scanner ulaz = new Scanner(System.in);
			
			
			System.out.println("Unesite vrednost za n: ");
			n = ulaz.nextInt();
			ulaz.close();
			
			do {
				cifra = n%10;
				n = n/10;
				System.out.println(cifra);
			}while(n>0);
	}

}
