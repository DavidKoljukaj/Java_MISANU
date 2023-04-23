package dk;

public class Point {

	private double x, y;

	Point(double a, double b) {
		x = a;
		y = b;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toSting() {
		return "(" + x + ", " + y + ")";

	}

}
