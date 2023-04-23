package dk;

import java.util.LinkedList;
import java.util.List;

public class LL1Main {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();

		// dodavanje elemenata u povezanoj listi
		ll.add("A"); // 0
		ll.add("B"); // 1

		ll.add(2, "C"); // 2

		System.out.println("Elementi povezane liste su: " + ll);

		// Brisanje elementa iz povezane liste
		ll.remove(0); // brisanje preko indeksa
		ll.remove("B"); // brisanje preko vrednosti

		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);

		ll.add("D");
		ll.add("E");
		ll.add("F");

		System.out.println("Elementi povezane liste su: " + ll);

		// trazenje elemenata u povezanoj listi:
		boolean sadrzi = ll.contains("E");

		if (sadrzi) {
			System.out.println("Lista sadrzi element E. ");
		} else {
			System.out.println("Lista ne sadrzi element E. ");
		}

		// Pristupanje(uzimanje) vrednosti elementa iz povezane liste
		Object element = ll.get(3);
		System.out.println("Trazeni element je: " + element);

		// Postavljanje vrednosti elementa u povezanoj listi
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);
	}

}
