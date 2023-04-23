package david.koljukaj;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					
					int a,n,i=1;
					System.out.println("Unesite vrednost za n: ");
					n = sc.nextInt();
					System.out.println("Unesite vrednost za a: ");
					a = sc.nextInt();
					sc.close();
					while (i<=n) {
						if(i%a == 0)
							System.out.println(i);
						i++;
						
					}
	}

}
