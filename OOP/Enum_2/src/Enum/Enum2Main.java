package Enum;

public class Enum2Main {

	public static void main(String[] args) {
		/*
		 * Sva nabrajanja imaju dve unapred definisane metode: values() - vraca niz koji
		 * sadrzi listu konstanti definisanih u nabrajanju
		 * 
		 * valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara znakovnom
		 * nizu prosledenom u argumentu
		 */

		Boje b;

		System.out.println("Boje: ");

		Boje nizBoja[] = Boje.values();

		for (Boje c : nizBoja) {
			System.out.println(c + " ");
		}

		Boje c1;
		/*
		 * Vraca vrednost iz nabrajanja koja odgovara imenu zadate konstante
		 */
		c1 = Boje.valueOf("Bela");

		System.out.println("Boje: " + c1);

	}

}
