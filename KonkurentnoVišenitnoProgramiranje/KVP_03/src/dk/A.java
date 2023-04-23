package dk;

/* Nit se moze napraviti i kada klasa Thread prosirimo
 * novom nasledenom klasom, a zatim napravite instancu
 * te klase.
 * 
 *  Nova potklasa mora da redefinishe metodu run()
 * */

public class A extends Thread {

	A(String s) {
		super(s); // poziva konstruktor Thread sledeceg oblika:
					// public Thread (String imeNiti)
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}

}
