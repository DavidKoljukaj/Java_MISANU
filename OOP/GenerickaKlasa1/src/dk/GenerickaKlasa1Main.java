package dk;

public class GenerickaKlasa1Main {

	public static void main(String[] args) {

		// Pravi A objekat za integer tip
		A<Integer> intObjekat = new A<Integer>(100);

		// Knjiga k1 = new Knjiga ("ABC",1100);

		intObjekat.prikaziTip();
		int vrednostIntObjekta = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekta);

		System.out.println();
		// Pravi A objekat za tip String
		A<String> stringObjekat = new A<String>("tekst");
		stringObjekat.prikaziTip();

		String str = stringObjekat.getOb();
		System.out.println("Vrednost: " + str);
	}

}
