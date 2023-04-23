package dk;

public class LambdaIzrazDomaci {

	public static void main(String[] args) {

		Provera broj = (n) -> (n < 0);

		if (broj.test(0))
			System.out.println("Broj je negativan.");
		else
			System.out.println("Broj je pozitivan.");
	}

}
