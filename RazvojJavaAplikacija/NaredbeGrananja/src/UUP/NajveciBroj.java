package UUP;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Unesite vrednost za a: ");
				int a = input.nextInt();
				System.out.println("Unesite vrednost za b: ");
				int b = input.nextInt();
				System.out.println("Unesite vrednost za c: ");
				int c = input.nextInt();
				
				int max=a;
				//int max;
				if ((a==b)&&(a==b)&&(b==c))
					System.out.println("Nije moguce odrediti maksimalan broj.");
				else {
					if(b>a)
						max=b;
					//else 
						//max=a;
					if(c>b)
						max=c;
					//else
						//max=a;
					//if(c>b)
						//max=c;
					//else 
						//max=b;
					
					
					System.out.println("Najveci broj je: " + max);
					input.close();
				}
	}

}
