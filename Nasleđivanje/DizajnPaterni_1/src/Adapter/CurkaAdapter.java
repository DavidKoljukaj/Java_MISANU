package Adapter;

/*
 * 1. Prvo se implementira interfejs tipa prema kojem se vrsi prilagodavanje. To je
 * interfejs koji klijent ocekuje
 */
public class CurkaAdapter implements Patka {

	Curka curka;

	// 2. Dobiti referencu na objekat koji prilagodavamo

	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}

	// 3. Implementacija metoda u interfejsu

	// Prevodenje kvace() u metodu curlice() izmedu klasa.
	public void kvace() {
		curka.curlice();
	}

	public void leti() {
		for (int i = 0; i < 5; i++) {
			curka.leti();
		}
	}
}
