package UUP;

import java.util.Scanner;

public class Primer8 {

	public static void main(String[] args) {
						Scanner input = new Scanner(System.in);
						int a,b,z;
						
						System.out.println("Unesite vrednost za a: ");
						a = input.nextInt();
						System.out.println("Unesite vrednost za b: ");
						b = input.nextInt();
						
						if(a%2 !=0&&b%2==0)
							z = a+b;
						else
							z = a*b;
						System.out.println("z = " + z);
						input.close();
						
	}

}
