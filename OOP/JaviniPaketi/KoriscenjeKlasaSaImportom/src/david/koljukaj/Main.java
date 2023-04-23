package david.koljukaj;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Bez importa prethodno java.util.Scanner a = new java.util.Scanner...
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double r, a;
		System.out.print("Unesite poluprecnik: ");
		r = sc.nextDouble();
		a = 3.14 * r * r;
		System.out.println("Povrsina kruga: " + a);
		sc.close();
	}

}
