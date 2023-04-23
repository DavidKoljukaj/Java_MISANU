package dk;

public class KVP1_Main {

	public static void main(String[] args) {

		/*
		 * Prilikom pokretanja Java programa, jedna programska nit odmah pocinje da se
		 * izvrsava. To je glavna ili inicijalna nit.
		 * 
		 * 
		 * Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metode
		 * currentThread() klase Thread.
		 */

		Thread t1 = Thread.currentThread();

		System.out.println("Trenutna nit:" + t1);

		// getName() - vraca ime niti
		System.out.println("Naziv niti: " + Thread.currentThread().getName());

		// getPriority() - vraca prioritet niti
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());

		/*
		 * [ime niti, prioritet, ime grupe kojoj pripada nit] Podrazumevano ime glavne
		 * niti je main. Njen prioritet je 5, sto je takode podrazumevana vrednost.
		 * Treci parametar main je ime grupe niti kojoj ta nit pripada Grupa niti je
		 * struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		 */
	}

}
