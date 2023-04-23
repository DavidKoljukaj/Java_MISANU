package dk;

public class KVP6_A implements Runnable {

	String name; // ime niti
	Thread t;

	KVP6_A(String name) { // KVP6_A je nova nit
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(name + " = " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
