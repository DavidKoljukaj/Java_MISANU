package UUP;

import java.util.Scanner;

public class KilobajtUBajt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Unesite vrednost u KB: "); 
		double kb = input.nextDouble(); 
		System.out.println("To je: " + (kb * 1024) + " bajta."); 
		 } 
	}

