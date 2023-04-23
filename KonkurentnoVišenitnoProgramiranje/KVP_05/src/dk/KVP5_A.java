package dk;

public class KVP5_A extends Thread {

	public void run() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i: " + i);
			// sleep(vrednostUMilisekundama)

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Nit je prekinuta.");
			}
			i++;
		}
	}
	/*
	 * Privremeno zaustavlja(suspenduje) izvrsavanje niti Argument metode sleep() je
	 * interval cekanja u milisekundama
	 * 
	 * Metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
	 * 
	 * Desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu
	 * nit.
	 */
}
