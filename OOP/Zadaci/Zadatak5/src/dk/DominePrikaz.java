package dk;

public class DominePrikaz {

	public static void main(String[] args) {

		Domine d1 = new Domine(4, 5);
		Domine d2 = new Domine(5, 2);
		Domine d3 = new Domine(5, 4);

		d1.getA();
		d1.getB();
		System.out.println(d1.opisDomine());
		d1.zamena();
		System.out.println("Nakon zamene:");
		d1.getA();
		d1.getB();
		System.out.println(d1.opisDomine());
		if (d1.jednakost(d3))
			System.out.println("Domine su iste.");
		else
			System.out.println("Domine su razlicite.");

		d2.getA();
		d2.getB();
		System.out.println(d2.opisDomine());

		d2.zamena();
		System.out.println("Nakon zamene:");
		d2.getA();
		d2.getB();
		System.out.println(d2.opisDomine());
		if (d2.jednakost(d1))
			System.out.println("Domine su iste.");
		else
			System.out.println("Domine su razlicite.");

		d3.getA();
		d3.getB();
		System.out.println(d3.opisDomine());
		d3.zamena();
		System.out.println("Nakon zamene:");
		d3.getA();
		d3.getB();
		System.out.println(d3.opisDomine());
		if (d3.jednakost(d2))
			System.out.println("Domine su iste.");
		else
			System.out.println("Domine su razlicite.");

	}

}
