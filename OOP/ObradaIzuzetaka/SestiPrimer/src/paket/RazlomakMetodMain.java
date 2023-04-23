package paket;

import java.util.Scanner;

public class RazlomakMetodMain {

	public static int razlomak(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, z = 0;

		System.out.println("Unesite brojilac razlomka:");
		x = sc.nextInt();
		System.out.println("Unesite imenilac razlomka: ");
		y = sc.nextInt();
		sc.close();
		try {
			z = razlomak(x, y);
			System.out.println("Kolicnik iznosi: " + z);
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom nije moguce.\n" + e);
		}

	}

}
