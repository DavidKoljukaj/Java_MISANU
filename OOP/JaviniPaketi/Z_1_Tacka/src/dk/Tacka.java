package dk;

public class Tacka {

	private double x, y;

	Tacka() {
	}

	Tacka(double a) {
		this.x = a;
	}

	public Tacka(double a, double b) {
		this.x = a;
		this.y = b;
	}

	double poteg() { // rastojanje od koordinatnog pocetka
		return Math.sqrt(x * x + y * y);
	}

	double Rastojanje(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2)) + Math.sqrt(Math.pow(y - t.y, 2));
	}

}
