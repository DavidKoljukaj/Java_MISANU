package david.koljukaj;

import java.util.Scanner;

public class Primer6 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int i,k,n,suma=0;
			System.out.println("Unesite vrednost za k: ");
			k = sc.nextInt();
			System.out.println("Unesite vrednost za n: ");
			n = sc.nextInt();
			
			i=k;
			while(i<=n)
				suma +=i++;
//			while(i<=n) {
//				suma +=i;
//				i++;
//			}
			
			System.out.println("Od " + k + " do " + n + " suma = " + suma);
			sc.close();
	}

}
