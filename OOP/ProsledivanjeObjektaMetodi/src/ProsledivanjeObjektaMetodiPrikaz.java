
public class ProsledivanjeObjektaMetodiPrikaz {

	public static void main(String[] args) {

		Circle c1 = new Circle(20);
		Circle c2 = new Circle(15);

		calcArea(c1);
		calcArea(c2);

	}

	public static void calcArea(Circle c) {
		System.out.println("Povrsina kruga: " + c.area());

	}

}
