package paket;

public class FinallyBlokWithException {

	// through an exception out of the method.
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo"); // "mi" bacamo izuzetak
			// throws je u zaglavlju metode
			// throw koristi se za bacanje izuzetka u telu metode
		} finally { // finally blok se izvrsava bez obzira
					// da li je ili nije doslo do izuzetka
			System.out.println("procA's finally");
		}
	}

	// return from within a try block
	static void procB() {
		try {
			System.out.println(" procB");
			return; // break, continue, System.exit(0)
		} finally {
			System.out.println("procB's finally");
		}
	}

	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}
}
