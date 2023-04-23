package paket;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 0;
			System.out.println("a = " + a);
			int b = 10 / a;

		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom.\n" + e);
		}
		try {

			int[] c = { 1 }; // jedan od nacina inicijalizacije niza
			c[10] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nepostojeci indeks unutar niza.\n" + e.getMessage());
		}

		System.out.println("Nakon try/catch,catch bloka.");
	}

}
