package Enum;

/* Nabrajanje je vrsta klase. 
 * Instanca klase ne pravi se pomocu kljucne reci new.
 * Rezervisana rec enum definise klasu.
 * Svaka konstanta definisana u nabrajanju je objekat
 * chiji tip je to isto nabrajanje.*/

public class Enum3Main {

	public static void main(String[] args) {

		Boja b;

		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());

		System.out.println("Sve boje: ");

		for (Boja c : Boja.values())
			System.out.println(c + " " + c.getUdeo());
	}

}
