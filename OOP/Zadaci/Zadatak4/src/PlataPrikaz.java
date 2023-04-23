
public class PlataPrikaz {

	public static void main(String[] args) {
		Plata p1 = new Plata();
		Plata p2 = new Plata("Zika", 5000, 75);
		Plata p3 = new Plata("Mika", 5000, 25);

		System.out.println("\tIME\t/\tPLATA\n" + p2.ispisivanjeRadnikPlata() + "\n" + p1.ispisivanjeRadnikPlata() + "\n"
				+ p3.ispisivanjeRadnikPlata());
	}

}
