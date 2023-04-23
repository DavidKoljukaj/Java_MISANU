package dk;

import java.util.Scanner;

public class Zadatak3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();

		while (broj < 0) {
			System.out.println("Unesite jedan pozitivan broj: ");
			broj = sc.nextInt();
		}

		int a = 0, count = 0; //
		while (a <= broj) {
			a = broj % 10;
			broj = broj / 10;
			if (a == 5) {
				count++;
				System.out.println("Broj sadrzi cifru 5.");
				break;
			}

		}
		if (count == 0) {
			System.out.println("Broj ne sadrzi cifru 5.");
		}

		sc.close();
	}

}
