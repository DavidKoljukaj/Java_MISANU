package david.koljukaj;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ocena;
		System.out.println("Unesite ocenu: ");
		ocena = input.nextInt();
		input.close();
		
		if(ocena == 1) {
			System.out.println("Nedovoljan");
		}else if(ocena ==2) {
			System.out.println("Dovoljan");
		}else if(ocena ==3) {
			System.out.println("Dobar");
		}else if(ocena ==4) {
			System.out.println("Vrlo dobar");
		}else if(ocena ==5) {
			System.out.println("Odličan");
		}else {
			System.out.println("Nepostojeća ocena");
		}
	}

}
