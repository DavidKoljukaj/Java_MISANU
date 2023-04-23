import java.util.Scanner;

public class MainLicniPodaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LicniPodaci p1 = new LicniPodaci();

		System.out.println("Unesite vase ime:");
		// p1.ime = sc.nextLine();
		p1.unesiIme(sc.nextLine());

		System.out.println("Unesite datum vaseg rođenja:");
		// p1.datum = sc.nextLine();
		p1.unesiDatum(sc.nextLine());

		System.out.println("Unesite vasu adresu:");
		// p1.adresa = sc.nextLine();
		p1.unesiAdresu(sc.nextLine());

		System.out.println(p1.ispisiPodatke());
		sc.close();

	}

}
