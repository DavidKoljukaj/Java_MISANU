package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsKljucnaRecMain {

	// throws (kljucna rec) koristi se u zaglavlju metode(najavi metode)
	// da naznachi tipove izuzetaka koje ta metoda moze da "baci"
	public static int kolicnik(int br, int im) throws ArithmeticException {
		return br / im;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Unesite brojilac:");
			int brojilac = sc.nextInt();
			System.out.println("Unesite imenilac:");
			int imenilac = sc.nextInt();
			sc.close();
			int kolicnik = kolicnik(brojilac, imenilac);
			System.out.println("Kolicnik: " + kolicnik);
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom!\n" + e);
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojnu vrednost!\n" + e.getMessage());
		}
	}

}
