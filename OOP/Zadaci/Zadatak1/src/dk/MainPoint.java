package dk;

import java.util.Scanner;

public class MainPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite koordinate tačaka X i Y: \nX=");
		double x = sc.nextDouble();
		System.out.print("Y=");
		double y = sc.nextDouble();
		sc.close();

		Point tacka = new Point(x, y);
		System.out.println(tacka.getX());
		System.out.println(tacka.getY());
		System.out.println(tacka.toSting());

	}

}
