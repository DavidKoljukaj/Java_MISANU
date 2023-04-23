package dk;

import java.util.Scanner;

public class Zadatak2Main {

	public static void main(String[] args) {
		int n, suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		n = sc.nextInt();

		while (n < 0) {
			System.out.println("Greska: Unesite pozitivan broj n: ");
			n = sc.nextInt();
		}
		int[] nizN = new int[n];

		System.out.println("Unesite n brojeva: ");
		for (int i = 0; i < nizN.length; i++) {
			System.out.print("Unesite " + (i + 1) + ". broj:  ");
			nizN[i] = sc.nextInt();
			if (nizN[i] % 2 != 0 && nizN[i] < 0) {
				suma += nizN[i];
			}
		}

		System.out.println("Zbir neparnih i negativnih: " + suma);

		sc.close();
	}

}
