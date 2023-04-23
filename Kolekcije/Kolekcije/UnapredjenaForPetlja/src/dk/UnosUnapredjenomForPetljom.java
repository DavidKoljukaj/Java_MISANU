package dk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UnosUnapredjenomForPetljom {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Da li uopste moze da se koristi unapredjena for petlja za unos elemenata
		// niza???
		/*
		 * What is a enhanced for loop? In Java, the for-each loop is used to iterate
		 * through elements of arrays and collections (like ArrayList). It is also known
		 * as the enhanced for loop.
		 */
		int[] niz = new int[5];
		System.out.println("Unesite elemente niza:");
		for (int i : niz) {
			System.out.println("Unesite " + (i + 1) + ". element:");
			niz[i] = Integer.parseInt(br.readLine());

		}

		for (int i : niz) {
			System.out.println(i);
		}
		br.close();
	}

}
