package UUP;

public class TestPas {
	public static void main(String[] args) {
		Pas p = new Pas();
		System.out.println("Klasa Pas");
		p.lajati();
		// p.dahci();
		ZlatniRetriver zr = new ZlatniRetriver();
		System.out.println("Klasa ZlatniRetriver");
		zr.lajati();
		// zr.dahci();
		zr.aportiraj();
	}
}