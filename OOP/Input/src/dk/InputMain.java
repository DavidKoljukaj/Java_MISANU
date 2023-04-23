package dk;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputMain {

	public static void main(String[] args) throws IOException {
		/*
		 * Za IO operacije Java koristi tokove tj. streamove Streamovi obezbedjuju nacin
		 * za rad sa podacima koji se primaju i salju.
		 */

		/*
		 * Klasa koja omogucuje da se poveze tastatura sa streamom je DataInputStream
		 * name = new DataInputStream(System.in);
		 */
		DataInputStream dis = new DataInputStream(System.in);

		// Povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt");

		System.out.println("Unesite string (za kraj unosa, unesite $)");

		// read()
		// write()

		char ch;

		while ((ch = (char) dis.read()) != '$') {
			fos.write(ch);
		}

		fos.close();

	}

}
