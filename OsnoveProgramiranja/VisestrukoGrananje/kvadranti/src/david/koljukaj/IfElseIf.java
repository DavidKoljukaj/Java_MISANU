package david.koljukaj;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kvd;
		
		System.out.println("Unesite vrednost kvadranta: ");
		kvd = sc.nextInt();
		sc.close();
		
		if (kvd == 1) {
			System.out.println("Nalazite se u prvom kvadrantu. 0-90°");
		}else if(kvd == 2) {
			System.out.println("Nalazite se u drugom kvadrantu. 90-180°");
		}else if(kvd == 3) {
			System.out.println("Nalazite se u trecem kvadrantu. 180-270°");	
		}else if(kvd == 4) {
			System.out.println("Nalazite se u cetvrtom kvadrantu. 270-360°");
		}else {
			System.out.println("Izvan koordinatnog sistema!");
		}
	}

}
