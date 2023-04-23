package UUP;

import java.util.Scanner;

public class Farenhajt {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Unesite temp u celzijusima: ");
			double tc=input.nextDouble();
			
			System.out.println("Temp u farenhajtima je: " + (tc * 1.8 + 32));

	}

}
