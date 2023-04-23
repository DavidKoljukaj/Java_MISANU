package dk;

public class KVP4Main {

	public static void main(String[] args) {
		KVP4_A a = new KVP4_A();
		KVP4_B b = new KVP4_B();

		/*
		 * Kada odredenoj niti zelite da dodate prioritet izvrsavanja, pozovite metodu
		 * setPriority(), koja je clan klase Thread. void setPriority(nivo) Parametrom
		 * "nivo" zadajemo nivo prioriteta niti za koju je metoda pozvana Vrednost mora
		 * biti u opsegu izmedu MIN_PRIORITY i MAX_PRIORITY, a vrednosti tih konstanti
		 * su izmedu 1 i 10. Podrazumevana vrednost iznosi 5, a moze se zadati preko
		 * NORM_PRIORITY.
		 */

		a.setPriority(Thread.MIN_PRIORITY + 5); // 1 -> 6
		b.setPriority(Thread.MAX_PRIORITY - 7); // 10 -> 3

		a.start();
		b.start();

		System.out.println("Kraj glavne niti.");

	}

}
