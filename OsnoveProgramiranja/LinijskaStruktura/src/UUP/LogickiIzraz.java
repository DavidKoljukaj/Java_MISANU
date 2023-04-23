package UUP;

import java.util.Scanner;

public class LogickiIzraz {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				System.out.println("Unesite vrednost za x: ");
				boolean x =input.nextBoolean();
				System.out.println("Unesite vrednost za y: ");
				boolean y =input.nextBoolean();
				
				//boolean z = !(x&y) | x&y;
				
				
				System.out.println("y= "+(!(x&y) | x&y));
				input.close();

	}

}
