package david.koljukaj;

import java.util.Scanner;

public class Primer3 {

	public static void main(String[] args) {
			Scanner ulaz = new Scanner(System.in);
			//int n,i=1;
			double s = 0;
			
			System.out.println("Unesite vrednost za n: ");
			int n = ulaz.nextInt();
			/*
			while(i<=n) {
				s +=(double) 1/i;
				i++;
			}
			*/
			for (int i = 1; i<=n; i++)
				s +=(double) 1/i;
			System.out.println("Suma reciprocnih vrednosti brojeva do " + n + " je: " + s);
			ulaz.close();
	}

}
