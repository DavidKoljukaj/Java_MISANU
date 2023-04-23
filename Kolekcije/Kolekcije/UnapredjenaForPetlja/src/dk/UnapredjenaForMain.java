package dk;

public class UnapredjenaForMain {

	public static void main(String[] args) {

		int[] niz = { 2, 5, 7, 9, 29 };

		// stampanje elemenata niza
		System.out.println("Stampanje elemenata niza for petljom:");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}

		System.out.println("\nStampanje elemenata niza unapredenom for petljom: ");
		for (int i : niz)
			System.out.println(i);

	}

}
