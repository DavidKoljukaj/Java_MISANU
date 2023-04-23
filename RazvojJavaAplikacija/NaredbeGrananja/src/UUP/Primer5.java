package UUP;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
				Scanner input = new Scanner (System.in);
				
				System.out.println("Unesite vrednost za a: ");
				double a = input.nextDouble();
				double y;
				
				if(a>0)
					y=Math.sqrt(a);
				else 
					y=a*a;
				
				System.out.println("y= " + y);
				input.close();
	}

}
