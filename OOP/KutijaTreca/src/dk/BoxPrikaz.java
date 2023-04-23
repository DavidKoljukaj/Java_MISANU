package dk;

public class BoxPrikaz {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();

		b1.width = 15;
		b1.height = 20;
		b1.depth = 25;

		b2.width = 10;
		b2.height = 20;
		b2.depth = 35;

		b1.volume();
		b2.volume();
	}

}
