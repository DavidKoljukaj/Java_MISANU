package david.koljukaj;

import java.util.Scanner;

public class Primer4 {

	public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite vrednost za n: ");
			n = sc.nextInt();
			sc.close();
			
			int i = 1;
			int s = 0;//suma svih parnih brojeva do zadatog
			while(i<=n) {
				if(i%2 == 0)// != za neparne
					//System.out.println(i);
					s +=i;
				i++;
			}
			System.out.println(s);
	}

}
