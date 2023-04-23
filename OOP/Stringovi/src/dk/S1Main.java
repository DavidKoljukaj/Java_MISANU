package dk;

public class S1Main {

	public static void main(String[] args) {
		/* Stringovi se predstavljaju klasom String */
		String str = "1234asfrweg435 fd() _ ASDFFE*()$%@";

		System.out.println(str);

		// Kreiranje stringa pomocu kljucne reci new
		String str1 = new String("Utorak, 24. januar");
		System.out.println(str1);

		// Inicijalizacija stringa postojecim stringom
		String s1 = "Podatak1";
		String s2 = new String(s1);
		System.out.println(s2);

		// Inicijalizacija nizom char vrednosti
		char[] s3 = { 'J', 'a', 'v', 'a' };
		System.out.println(s3);

		// Inicijalizacije podnizom
		String s4 = new String(s3, 0, 2);
		System.out.println(s4);

	}

}
