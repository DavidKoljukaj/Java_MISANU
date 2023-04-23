package dk;

import java.util.Scanner;

public class MatricaPrikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova matrice M:");
		int red = sc.nextInt();
		System.out.println("Unesite broj kolona matrice M:");
		int kolona = sc.nextInt();

		Matrica m1 = new Matrica(red, kolona);

		System.out.println("Unesite vrednost elementa:");
		for (int i = 0; i < red; i++) {

			for (int j = 0; j < kolona; j++) {
				System.out.print("X[" + i + "," + j + "]=");
				m1.setElement(i, j, sc.nextInt());
			}
		}

		System.out.println("Matrica M:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				m1.getElement(i, j);
			}
			System.out.println();
		}
		sc.close();
	}

}
