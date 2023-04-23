package dk;

import java.util.LinkedList;
import java.util.List;

public class LL2Main {

	public static void main(String[] args) {

		String[] imena = { "Mika", "Zika", "Fica" };

		List<String> listaImena = new LinkedList<String>();
		for (String s : imena)
			listaImena.add(s);

		System.out.println("Prva lista pre dodavanja imena: " + listaImena);

		String[] imena1 = { "Ana", "Lena", "Hana", "Una" };
		List<String> listaImena1 = new LinkedList<String>();
		for (String s : imena1)
			listaImena1.add(s);

		System.out.println("Druga lista pre dodavanja imena: " + listaImena1);

		listaImena.addAll(listaImena1);
		System.out.println("Lista nakon dodavanja imena: " + listaImena);
		System.out.println(listaImena);

		listaImena.subList(0, 2).clear();
		System.out.println("Lista nakon uklanjanja imena na poziciji: ");
		System.out.println(listaImena);

	}

}
