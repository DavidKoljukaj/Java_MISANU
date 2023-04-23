package Adapter;

public class AdapterMain {

	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {

		// DivljaCurka patka = new DivljaCurka();

		DivljaPatka patka = new DivljaPatka();
		Curka curka = new DivljaCurka();

		// Umotavamo curku u CurkaAdapter, usled chega
		// ce izgledati kao Patka

		Patka curkaAdapter = new CurkaAdapter(curka);

		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();

		System.out.println("Patka: ");
		testPatka(patka);

		// Pokusavamo da maskiramo curku kao patku
		System.out.println("AdapterCurka");
		testPatka(curkaAdapter);// ne zna da je dobila curku prerusenu u patku
	}

}
