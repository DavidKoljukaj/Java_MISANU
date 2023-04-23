package dk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Zadatak4Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();

		int n;

		System.out.println("Unesite jedan broj: ");
		n = sc.nextInt();

		int a = 0;
		while (n != 0) {
			a = n % 10;
			lista.add(a);
			n = n / 10;
		}

		Iterator<Integer> iter = lista.iterator();
		System.out.println("Palindrom unetog broja je: ");
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}

		ListIterator<Integer> lIter = lista.listIterator();
		System.out.println("\nUneti broj koriscenjem hasPrevious metode listIteratora: ");
		while (lIter.hasPrevious()) {
			System.out.print(lIter.previous());
		}

		sc.close();
	}

}
