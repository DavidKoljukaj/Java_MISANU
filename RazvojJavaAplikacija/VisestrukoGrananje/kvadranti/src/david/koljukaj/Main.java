package david.koljukaj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			//Napisati program kojim se ispisuju moguce
			//vrednosti koordinata x i y zavisno od
			//broja kvadranta koji se unosi
		Scanner sc = new Scanner(System.in);
		int kvd;
		
		System.out.println("Unesite vrednost kvadranta: ");
		kvd = sc.nextInt();
		sc.close();
		switch (kvd) {
		case 1:
		{
			System.out.println("Nalazite se u prvom kvadrantu. 0-90°"   );
		}
			
			break;
		case 2:
		{
			System.out.println("Nalazite se u drugom kvadrantu. 90-180°" );
		}
			
			break;
		case 3:
		{
			System.out.println("Nalazite se u trecem kvadrantu. 180-270°");
		}
			
			break;
		case 4:
		{
			System.out.println("Nalazite se u cetvrtom kvadrantu. 270-360°");
		}
			
			break;

		default:
		{
			System.out.println("Izvan koordinatnog sistema.");
		}
			break;
		}
	}

}
