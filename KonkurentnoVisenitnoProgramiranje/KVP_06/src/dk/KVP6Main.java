package dk;

public class KVP6Main {

	public static void main(String[] args) {

		// isAlive() - utvrduje da li se nit jos izvrsava
		// join() - ceka da se druga nit zavrsi
		KVP6_A a1 = new KVP6_A("Prva nit");
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());

		KVP6_A a2 = new KVP6_A("Druga nit");
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());

		KVP6_A a3 = new KVP6_A("Treca nit");
		System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());

		try {
			a1.t.join();
			a2.t.join();
			a3.t.join();
		} catch (Exception e) {
		}
		System.out.println("Prva nit se izvrsava: " + a1.t.isAlive());
		System.out.println("Druga nit se izvrsava: " + a2.t.isAlive());
		System.out.println("Treca nit se izvrsava: " + a3.t.isAlive());
	}

}
