package paket;

public class Main {

	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 10 / a;
		} catch (ArithmeticException e) {
			System.out.println("Izuzetak: \n" + e);

			/*
			 * } catch(ArithmeticException e) { System.out.println("Izuzetak1: \n" + e); }
			 */

			// Ukoliko postoji vise catch blokova ciji tip parametra
			// odgovara tipu bachenog izuzetka, izvrshava se samo
			// prvi takav catch blok.
			// Greshka je navesti dva catch bloka sa istim tipom parametra.
		}

	}
}