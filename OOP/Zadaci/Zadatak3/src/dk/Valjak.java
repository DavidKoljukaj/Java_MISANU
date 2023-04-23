package dk;

public class Valjak {

	double poluprecnik;
	double visina;

	Valjak() {
		poluprecnik = 1;
		visina = 1;
	}

	public String getRandH() {
		return "r=" + poluprecnik + "\nh=" + visina;
	}

	public double izracunajZapreminu() {
		return Math.PI * poluprecnik * poluprecnik * visina;
	}

	public String IspisiPodatke() {
		return getRandH() + "\nV=" + izracunajZapreminu();
	}
}
