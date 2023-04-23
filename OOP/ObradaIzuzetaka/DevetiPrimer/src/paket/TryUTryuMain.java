package paket;

public class TryUTryuMain {

	public static void main(String[] args) {

		try {
			int a = 1; // 0,1,2 vrednosti za testriranje
			int b = 10 / a;
			System.out.println(" a =" + a);

			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int[] c = { 1 };
					c[10] = 100;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// unutrasnji catch blok
				System.out.println("Greska sa indeksom. \n" + e);
			}

		} catch (ArithmeticException e) {
			// spoljasnji catch blok
			System.out.println("Deljenje nulom.\n" + e);
		}
	}

}
