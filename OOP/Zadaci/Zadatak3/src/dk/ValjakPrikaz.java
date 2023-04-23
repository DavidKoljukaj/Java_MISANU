package dk;

public class ValjakPrikaz {

	public static void main(String[] args) {

		Valjak v1 = new Valjak();
		Valjak v2 = new Valjak();

		v1.poluprecnik = 3;
		v1.visina = 5;
		v1.izracunajZapreminu();

		System.out.println(v1.IspisiPodatke() + "\nv2=" + v2.izracunajZapreminu());
	}

}
