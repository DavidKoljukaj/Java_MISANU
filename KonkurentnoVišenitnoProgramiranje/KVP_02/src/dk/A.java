package dk;

/*Nit se moze napraviti za svaki objekat koji implementira
 * interface Runnable.
 * Da bi klasa implementirala interface Runnable.
 * potrebno je samo da ima metodu run(), deklarisana
 * u sledecem obliku: public void run()
 * U metodi run() zadajemo kod koji treba da se
 * izvrsava u novoj niti.
 * Kada se izvrsi metoda run() nit se unistava.
 * */

public class A implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
