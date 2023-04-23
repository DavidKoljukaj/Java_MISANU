package david.koljukaj;

import static java.lang.Math.PI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double r, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite poluprecnik: ");
		r = sc.nextDouble();
		a = PI * r * r;
		System.out.println("Povrsina kruga: " + a);
		sc.close();
	}

}
