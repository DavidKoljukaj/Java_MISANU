package david.koljukaj;

public class Circle {

	private double radius;

	Circle(double rad) {
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
