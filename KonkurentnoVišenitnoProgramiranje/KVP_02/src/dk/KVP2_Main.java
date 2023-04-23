package dk;

/* Pokretanje nove niti
 * Novu nit pokrecemo tako sto napravimo instancu
 * objekta tipa Thread
 * To se moze uraditi na dva nacina:
 * 1. Implementacija interface-a Runnable **
 * 2. Prosirivanjem klase Thread 
 * 
 * 
 * U main klasi:
 * Nakon kreiranja klase koja implementira interface Runnable
 * potrebno je napraviti instancu objekta tipa Thread ***
 * */

public class KVP2_Main {

	public static void main(String[] args) {

		A a = new A(); // **

		// ***
		// Oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)
		// objekatNit je instanca klase koja implementira interface Runnable.
		// Definise mesto gde zapocinje nit.

		/*
		 * imeNiti - predstavlja ime nove niti (koje sami zadajemo)
		 */

		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");

		t1.start(); // metoda start() poziva metodu run()
		t2.start();
		t3.start();

	}

}
