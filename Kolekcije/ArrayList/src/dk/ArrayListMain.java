package dk;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {

		// interfejs <T> ime = new ArrayList<T>();
		// T predstavlja tip promenljive
		List<Integer> kolekcijaAL = new ArrayList<Integer>();

		// add
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);

		System.out.println(kolekcijaAL);
	}

}
