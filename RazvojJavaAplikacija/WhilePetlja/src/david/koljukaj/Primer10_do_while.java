package david.koljukaj;

import java.util.Scanner;

public class Primer10_do_while {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double s=0;
			int i=1,n;
			System.out.println("Unesite vrednost za n: ");
			n = sc.nextInt();
			sc.close();
			
			while (i<=n) {
				s += (double) 1/(2*i);
				i++;
			}
			System.out.println("Suma S = " + s);
	}

}
