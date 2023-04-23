package Enum;

public class Enum4Main {

	public static void main(String[] args) {
		/*
		 * ordinal() - dobija redni broj, tj. polozaj date konstante u listi konstanti u
		 * nabrajanju. Redni brojevi pocinju od 0
		 */

		for (Boja a : Boja.values())
			System.out.println(a + " " + a.ordinal());

		/*
		 * compareTo() - poredi redne brojeve dvaju konstanti iz istog nabrajanja Ako je
		 * redni broj pozivajuce konstante manji od rednog broja konstante, metoda
		 * compareTo() vraca negativan broj. Ukoliko su redni brojevi jednaki, metoda
		 * vraca nulu. Ako pozivajuca konstanta ima redno broj veci od rednog broja
		 * konstante, metoda vraca pozitivan broj.
		 */

		Boja b1, b2, b3;

		b1 = Boja.Crvena;
		b2 = Boja.Zelena;
		b3 = Boja.Plava;

		if (b1.compareTo(b2) < 0)
			System.out.println(b1 + " dolazi pre " + b2);
		if (b1.compareTo(b2) > 0)
			System.out.println(b1 + " dolazi posle " + b2);
		if (b1.compareTo(b3) == 0)
			System.out.println(b1 + " jednako " + b3);

		/*
		 * equals() - poredi se jednakost konstante iz nabrajanja sa svakim drugim
		 * objektom
		 */

		if (b1.equals(b2))
			System.out.println("Greska");
		if (b1.equals(b3))
			System.out.println(b1 + " jednako " + b3);
		if (b1 == b3)
			System.out.println(b1 + " == " + b3);

	}

}
