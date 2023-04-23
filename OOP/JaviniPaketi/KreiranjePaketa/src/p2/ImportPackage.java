package p2;

import p1.First;

public class ImportPackage {

	/*
	 * Paketi(packages) Paketi sluze za grupisanje klasa. Primera radi, mozete
	 * napraviti dve klase sa istim nazivom unutar dva razlicita paketa. Paket je
	 * istovremeno mehanizam za imenovanje i za upravljanje vidljivoscu klasa.
	 * Paketi sadrže klase. Klase sadrže polja (fields) i metode (methods). Metode
	 * sadrže lokalne promenljive.
	 * 
	 * Nema globalnih promenljivih u Javi!
	 */

	public static void main(String[] args) {

		First f = new First();
		f.view();
	}

}
