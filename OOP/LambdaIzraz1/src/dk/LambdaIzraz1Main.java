package dk;

public class LambdaIzraz1Main {

	public static void main(String[] args) {

		// TestiraBroj paranBroj = /*ovde dolazi lambda izraz*/

		TestiraBroj paranBroj = (n) -> (n % 2 == 0);

		if (paranBroj.test(13)) {
			System.out.println("Broj je paran.");
		} else {
			System.out.println("Broj nije paran.");
		}
	}

}
