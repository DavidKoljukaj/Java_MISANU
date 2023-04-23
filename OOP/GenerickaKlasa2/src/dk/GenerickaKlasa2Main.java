package dk;

public class GenerickaKlasa2Main {

	public static void main(String[] args) {

		A<Integer, String> objekat1 = new A<Integer, String>(100, "Java");
		objekat1.prikaziTip();

		int intVrednost = objekat1.getObj1();
		System.out.println("Vrednost: " + intVrednost);
		String strVrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strVrednost);

		A<String, Double> objekat2 = new A<String, Double>("San", 555.554);
		objekat2.prikaziTip();

		String str2Vrednost = objekat2.getObj1();
		System.out.println("Vrednost za T je: " + str2Vrednost);
		double dblVrednost = objekat2.getObj2();
		System.out.println("Vrednost za V je: " + dblVrednost);

		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();

		Boolean bulVrednost = objekat3.getObj1();
		System.out.println("Vrednost za T je: " + bulVrednost);
		int int2Vrednost = objekat3.getObj2();
		System.out.println("Vrednost za V je: " + int2Vrednost);

	}

}
