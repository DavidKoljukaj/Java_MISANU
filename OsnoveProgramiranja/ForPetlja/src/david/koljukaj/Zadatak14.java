package david.koljukaj;

import java.io.*;

public class Zadatak14 {

	public static void main(String[] args) throws Exception {
				// Napisati prog. za izracunavanje aritmeticke sredine parnih brojeva.
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int sredina=0,zbir = 0;
		
		System.out.println("Za koliko parnih brojeva zelite da izracunate arit. sredinu? ");
		int brojUkupno = Integer.parseInt(ulaz.readLine());
		
		for (int i =1; i<=brojUkupno; i++)
		{
			System.out.println("Unesite " + i + ". broj: ");
			int broj = Integer.parseInt(ulaz.readLine());
			
			if(zbir%2 == 0) {
				zbir = zbir + broj;
				sredina = zbir/brojUkupno;
				System.out.println("Aritmeticka sredina zadatih parnih brojeva je: " + sredina);
			}else {
				System.out.println("Unesite parne brojeve.");
			}
		}
		
		
	}

}
