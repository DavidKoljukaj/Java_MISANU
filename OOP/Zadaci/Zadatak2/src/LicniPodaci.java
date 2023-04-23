
public class LicniPodaci {

	// public String ime, datum, adresa;
	private String ime, datum, adresa;

	public void unesiIme(String a) {
		ime = a;
	}

	public void unesiDatum(String b) {
		datum = b;
	}

	public void unesiAdresu(String c) {
		adresa = c;
	}

	public String ispisiPodatke() {
		return "Ime: " + ime + "\nDatum rođenja: " + datum + "\nAdresa stanovanja: " + adresa;
	}
}
