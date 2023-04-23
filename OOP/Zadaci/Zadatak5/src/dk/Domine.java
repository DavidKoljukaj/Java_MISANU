package dk;

public class Domine {

	private int a, b;

	Domine() {
		a = 1;
		b = 1;
	}

	Domine(int aa, int bb) {
		a = aa;
		b = bb;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void zamena() {

		int n = a;
		a = b;
		b = n;
	}

	public boolean jednakost(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public String opisDomine() {
		return "(" + a + "," + b + ")";
	}
}
