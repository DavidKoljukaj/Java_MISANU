package david.koljukaj;

import java.io.*;

public class Zadatak13 {

	public static void main(String[] args) throws Exception {
				// Napisati prog. za izracunavanje aritmeticke sredine unetih brojeva.
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int sredina=0,zbir = 0;
		
		System.out.println("Za koliko brojeva zelite da izracunate arit. sredinu? ");
		int brojUkupno = Integer.parseInt(ulaz.readLine());
		
		for (int i =1; i<=brojUkupno; i++)
		{
			System.out.println("Unesite " + i + ". broj: ");
			int broj = Integer.parseInt(ulaz.readLine());
			zbir = zbir + broj;
		}
		sredina = zbir/brojUkupno;
		System.out.println("Aritmeticka sredina zadatih brojeva je: " + sredina);
		
	}

}
